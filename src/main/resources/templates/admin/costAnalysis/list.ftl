<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <title>成本分析</title>
    <meta name="renderer" content="webkit">
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
    <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
    <meta name="apple-mobile-web-app-status-bar-style" content="black">
    <meta name="apple-mobile-web-app-capable" content="yes">
    <meta name="format-detection" content="telephone=no">
    <link rel = "shortcut icon" href="${site.logo}">
    <link rel="stylesheet" href="${base}/static/layui/css/layui.css" media="all" />
    <link rel="stylesheet" href="${base}/static/css/user.css" media="all" />
    <link rel="stylesheet" href="${base}/static/formatJSON/jsonFormater.css" media="all" />
    <style>
        #Canvas {
            margin-top: 13px;
            padding: 20px 20px;
        }
        div.Canvas {
            font-size: 13px;
            background-color: #ECECEC;
            color: #000000;
            border: solid 1px #CECECE;
        }
    </style>
</head>
<body class="childrenBody">
<fieldset class="layui-elem-field">
    <legend>历史检索</legend>
    <div class="layui-field-box">
        <form class="layui-form">
            <div class="layui-inline" style="margin-left: 15px">
                <label>设备名称:</label>
                <div class="layui-input-inline">
                    <input type="text" value="" name="s_title" placeholder="请输入设备名称" class="layui-input search_input">
                </div>
            </div>
            <div class="layui-inline" style="margin-left: 15px">
                <label>设备型号:</label>
                <div class="layui-input-inline">
                    <input type="text" value="" name="s_username" placeholder="请输入设备型号" class="layui-input search_input">
                </div>
            </div>
            <div class="layui-inline">
                <a class="layui-btn" lay-submit="" lay-filter="searchForm">查询</a>
            </div>
            <div class="layui-inline" >
                <button type="reset" class="layui-btn layui-btn-primary">重置</button>
            </div>
            <div class="layui-inline">
                <a class="layui-btn layui-btn-danger" data-type="deleteSome">批量删除</a>
            </div>
        </form>
    </div>
</fieldset>
<div class="layui-form users_list">
    <table class="layui-table" id="test" lay-filter="demo"></table>

    <script type="text/html" id="params">
        {{# if(d.params != '' && d.params != null){ }}
        <a class="layui-btn layui-btn-normal layui-btn-xs" lay-event="showParams">点我显示</a>
        {{# }else{ }}
        <span></span>
        {{# } }}
    </script>
    <script type="text/html" id="response">
        {{# if(d.httpMethod == 'GET'){ }}
        <span>{{ d.response }}</span>
        {{# }else{ }}
        <a class="layui-btn layui-btn-normal layui-btn-xs" lay-event="showResponse">点我显示</a>
        {{# } }}
    </script>
    <script type="text/html" id="barDemo">
        <a class="layui-btn layui-btn-danger layui-btn-xs" lay-event="del">删除</a>
    </script>
</div>
<div id="page"></div>
<div id='jsonContainer' class="Canvas" style="display: none"></div>
<script>
    var baseDir = '${base}';
</script>
<script type="text/javascript" src="https://cdn.bootcss.com/jquery/3.2.1/jquery.min.js"></script>
<script type="text/javascript" src="${base}/static/layui/layui.js"></script>
<script type="text/javascript" src="${base}/static/js/tools.js"></script>
<script type="text/javascript" src="${base}/static/formatJSON/jsonFormater.js?v=3.0"></script>
<script>
    layui.use(['layer','form','table'], function() {
        var layer = layui.layer,
                $ = layui.jquery,
                form = layui.form,
                table = layui.table,
                t;                  //表格数据变量

        t = {
            elem: '#test',
            url:'${base}/admin/system/log/list',
            method:'post',
            page: { //支持传入 laypage 组件的所有参数（某些参数除外，如：jump/elem） - 详见文档
                layout: ['limit', 'count', 'prev', 'page', 'next', 'skip'], //自定义分页布局
                //,curr: 5 //设定初始在第 5 页
                groups: 4, //只显示 1 个连续页码
                first: "首页", //显示首页
                last: "尾页", //显示尾页
                limits:[3,10, 20, 30]
            },
            width: $(parent.window).width()-223,
            cols: [[
                {type:'checkbox'},
                {field:'type', title: '设备名称'},
                {field:'title',  title: '设备型号'},
                {field:'remoteAddr',     title: '折旧成本/小时'},
                {field:'username',       title: '利息成本/小时'},
                {field:'requestUri',    title: '保险成本/小时'},
                {field:'httpMethod',    title: '财产税成本/小时'},
                {field:'id',    title: '总拥有成本/小时'},
                {field:'sessionId',    title: '燃油成本/小时'},
                {field:'id',    title: '润滑油及人工成本/小时（使用系数）'},
                {field:'useTime',    title: '滤芯成本/小时（使用系数）'},
                {field:'browser',    title: '底盘，铲刀&链轨成本/小时'},
                {field:'exception',    title: '维修成本/小时'},
                {field:'exception',    title: '其他易损件成本/小时'},
                {field:'exception',    title: '操作手工资/小时'},
                {field:'exception',    title: '总使用成本/小时'},
                {field:'exception',    title: '拥有成本&使用成本/小时'},
                {field:'createDate',  title: '创建时间',templet:'<div>{{ layui.laytpl.toDateString(d.createDate) }}</div>',unresize: true}, //单元格内容水平居中
                {fixed: 'right', title: '操作',width: '10%',align: 'center',toolbar: '#barDemo'}
            ]]
        };
        table.render(t);

        //监听工具条
        table.on('tool(demo)', function(obj){
            var data = obj.data;
            if(obj.event === "del"){
                layer.confirm("你确定要删除该记录么？",{btn:['是的,我确定','我再想想']},
                        function(){
                            $.post("${base}/admin/system/log/delete",{"ids":[data.id]},function (res){
                                if(res.success){
                                    layer.msg("删除成功",{time: 1000},function(){
                                        table.reload('test', t);
                                    });
                                }else{
                                    layer.msg(res.message);
                                }

                            });
                        }
                )
            }
            if(obj.event === "showParams"){
                $("#jsonContainer").empty();
                var options = {dom : document.getElementById('jsonContainer')};
                window.jf = new JsonFormatter(options);
                jf.doFormat(data.params);
                layer.open({
                    type: 1,
                    title: false,
                    closeBtn: 0,
                    area: '516px',
                    shadeClose: true,
                    content: $('#jsonContainer')
                });
            }
            if(obj.event === "showResponse"){
                $("#jsonContainer").empty();
                var options = {dom : document.getElementById('jsonContainer')};
                window.jf = new JsonFormatter(options);
                jf.doFormat(data.response);
                layer.open({
                    type: 1,
                    title: false,
                    closeBtn: 0,
                    area: '516px',
                    shadeClose: true,
                    content: $('#jsonContainer')
                });
            }
        });

        //功能按钮
        var active={
            deleteSome : function(){                        //批量删除
                var checkStatus = table.checkStatus('test'),
                        data = checkStatus.data;
                if(data.length > 0){
                    layer.confirm("你确定要删除这些日志么？",{btn:['是的,我确定','我再想想']},
                            function(){
                                var d = [];
                                for(var i=0;i<data.length;i++){
                                    d.push(data[i].id);
                                }
                                $.post("${base}/admin/system/log/delete",{ids:d},function (res) {
                                    if(res.success){
                                        layer.msg("删除成功",{time: 1000},function(){
                                            table.reload('test', t);
                                        });
                                    }else{
                                        layer.msg(res.message);
                                    }
                                });
                            }
                    )
                }else{
                    layer.msg("请选择需要删除的日志",{time:1000});
                }
            }
        };

        $('.layui-inline .layui-btn').on('click', function(){
            var type = $(this).data('type');
            active[type] ? active[type].call(this) : '';
        });

        //搜索
        form.on("submit(searchForm)",function(data){
            t.where = data.field;
            table.reload('test', t);
            return false;
        });

    });
</script>
</body>
</html>