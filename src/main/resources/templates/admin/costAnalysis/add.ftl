<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <title>信息添加</title>
    <meta name="renderer" content="webkit">
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
    <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
    <meta name="apple-mobile-web-app-status-bar-style" content="black">
    <meta name="apple-mobile-web-app-capable" content="yes">
    <meta name="format-detection" content="telephone=no">
    <link rel="stylesheet" href="${base}/static/layui/css/layui.css" media="all" />
    <style type="text/css">
        .layui-form-item .layui-inline{ width:33.333%; float:left; margin-right:0; }
        @media(max-width:1240px){
            .layui-form-item .layui-inline{ width:100%; float:none; }
        }
        .layui-form-item .role-box {
            position: relative;
        }
        .layui-form-item .role-box .jq-role-inline {
            height: 100%;
            overflow: auto;
        }
        .layui-table-cell {
            height: auto;
            line-height: 18px;
        }
    </style>
</head>
<body class="childrenBody">
<form class="layui-form" style="width:80%;">
    <div class="layui-form-item">
        <table class="layui-table">
            <colgroup>
                <col width="150">
                <col width="200">
                <col width="200">
                <col>
            </colgroup>
            <thead>
            <tr>
                <th></th>
                <th style="font-weight: bold;text-align: center">山推</th>
                <th style="font-weight: bold;text-align: center">竞品</th>
            </tr>
            </thead>
            <tbody>
            <tr>
                <td>设备型号</td>
                <td>
                    <select lay-filter="device_shantui" name="device_shantui" lay-verify="required" lay-search>
                        <option value="">直接选择或搜索选择</option>
                        <#list deviceListShantui as device>
                            <option value="${device.id}" device_desc="${device.deviceDesc}">${device.deviceName}</option>
                        </#list>
                    </select>
                </td>
                <td>
                    <select lay-filter="device_other" name="device_other" lay-verify="required" lay-search>
                        <option value="">直接选择或搜索选择</option>
                        <#list deviceListOther as device>
                            <option value="${device.id}" device_desc="${device.deviceDesc}">${device.deviceName}</option>
                        </#list>
                    </select>
                </td>
            </tr>
            <tr>
                <td>设备描述</td>
                <td><label style="width: 100%;text-align: left" id="deviceDesc_shantui" class="layui-form-label"></label></td>
                <td><label style="width: 100%;text-align: left" id="deviceDesc_other"  class="layui-form-label"></label></td>
            </tr>
            <tr>
                <td>预计拥有年限（年）</td>
                <td><input type="text" class="layui-input" name="years_shantui" autocomplete="off" placeholder="请输入拥有年限"></td>
                <td><input type="text" class="layui-input" name="years_other" autocomplete="off" placeholder="请输入拥有年限"></td>
            </tr>
            <tr>
                <td>预计工作时间（小时/年）</td>
                <td><input type="text" class="layui-input" name="hours_shantui" autocomplete="off" placeholder="请输入工作时间"></td>
                <td><input type="text" class="layui-input" name="hours_other" autocomplete="off" placeholder="请输入工作时间"></td>
            </tr>
            <tr>
                <td colspan="3" style="text-align: left;font-weight: bold;">拥有成本</td>
            </tr>
            <tr>
                <td>货币类型</td>
                <td>人民币CNY</td>
                <td>人民币CNY</td>
            </tr>
            <tr>
                <td>汇率</td>
                <td>1</td>
                <td>1</td>
            </tr>
            <tr>
                <td>交付价格（包括附件）</td>
                <td><input type="text" class="layui-input" name="paymentPriceShantui" autocomplete="off" placeholder="请输入支付价格"></td>
                <td><input type="text" class="layui-input" name="paymentPriceOther" autocomplete="off" placeholder="请输入支付价格"></td>
            </tr>
            <tr>
                <td>更换所有轮胎的价格</td>
                <td><input type="text" class="layui-input" name="tireChangePriceShantui" autocomplete="off" placeholder="请输入更换轮胎价格"></td>
                <td><input type="text" class="layui-input" name="tireChangePriceOther" autocomplete="off" placeholder="请输入更换轮胎价格"></td>
            </tr>
            <tr>
                <td>以旧换新或转售价格</td>
                <td><input type="text" class="layui-input" name="resalePriceShantui" autocomplete="off" placeholder="请输入转售价格"></td>
                <td><input type="text" class="layui-input" name="resalePriceOther" autocomplete="off" placeholder="请输入转售价格"></td>
            </tr>
            <tr>
                <td>折旧金额</td>
                <td><label style="width: 100%;text-align: left" id="depreciationAmountShantui" class="layui-form-label"></label></td>
                <td><label style="width: 100%;text-align: left" id="depreciationAmountOther"  class="layui-form-label"></label></td>
            </tr>
            <tr>
                <td>折旧成本/小时</td>
                <td><label style="width: 100%;text-align: left" id="depreciationCostShantui" class="layui-form-label"></label></td>
                <td><label style="width: 100%;text-align: left" id="depreciationCostOther"  class="layui-form-label"></label></td>
            </tr>
            <tr>
                <td>预计融资期</td>
                <td><input type="text" class="layui-input" name="financingPeriodShantui" autocomplete="off" placeholder="请输入预计融资期"></td>
                <td><input type="text" class="layui-input" name="financingPeriodOther" autocomplete="off" placeholder="请输入预计融资期"></td>
            </tr>
            <tr>
                <td>利息率</td>
                <td><input type="text" class="layui-input" name="rateShantui" autocomplete="off" placeholder="请输入利息率"></td>
                <td><input type="text" class="layui-input" name="rateOther" autocomplete="off" placeholder="请输入利息率"></td>
            </tr>
            <tr>
                <td>利息成本/小时</td>
                <td><label style="width: 100%;text-align: left" id="rateCostShantui" class="layui-form-label"></label></td>
                <td><label style="width: 100%;text-align: left" id="rateCostOther"  class="layui-form-label"></label></td>
            </tr>
            <tr>
                <td>保险率</td>
                <td><input type="text" class="layui-input" name="insuranceRateShantui" autocomplete="off" placeholder="请输入保险率"></td>
                <td><input type="text" class="layui-input" name="insuranceRateOther" autocomplete="off" placeholder="请输入保险率"></td>
            </tr>
            <tr>
                <td>或每年成本</td>
                <td><input type="text" class="layui-input" name="insuranceYearCostShantui" autocomplete="off" placeholder="请输入每年成本"></td>
                <td><input type="text" class="layui-input" name="insuranceYearCostOther" autocomplete="off" placeholder="请输入每年成本"></td>
            </tr>
            <tr>
                <td>保险成本/小时</td>
                <td><label style="width: 100%;text-align: left" id="insuranceCostShantui" class="layui-form-label"></label></td>
                <td><label style="width: 100%;text-align: left" id="insuranceCostOther"  class="layui-form-label"></label></td>
            </tr>
            <tr>
                <td>税率</td>
                <td><input type="text" class="layui-input" name="taxRateShantui" autocomplete="off" placeholder="请输入税率"></td>
                <td><input type="text" class="layui-input" name="taxRateOther" autocomplete="off" placeholder="请输入税率"></td>
            </tr>
            <tr>
                <td>或每年成本</td>
                <td><input type="text" class="layui-input" name="assetYearCostShantui" autocomplete="off" placeholder="请输入每年成本"></td>
                <td><input type="text" class="layui-input" name="assetYearCostOther" autocomplete="off" placeholder="请输入每年成本"></td>
            </tr>
            <tr>
                <td>财产税成本/小时</td>
                <td><label style="width: 100%;text-align: left" id="assetRateCostShantui" class="layui-form-label"></label></td>
                <td><label style="width: 100%;text-align: left" id="assetRateCostOther"  class="layui-form-label"></label></td>
            </tr>
            <tr>
                <td style="font-weight: bold;">总拥有成本/小时</td>
                <td><label style="width: 100%;text-align: left" id="ownCostShantui" class="layui-form-label"></label></td>
                <td><label style="width: 100%;text-align: left" id="ownCostCostOther"  class="layui-form-label"></label></td>
            </tr>
            <tr>
                <td colspan="3" style="text-align: left;font-weight: bold;">使用成本</td>
            </tr>
            <tr>
                <td>油耗条件</td>
                <td>
                    <select lay-filter="fuelConsumption_shantui" name="insuranceCostShantui" lay-verify="required" id="fuelConsumption_shantui">
                    </select>
                </td>
                <td>
                    <select lay-filter="fuelConsumption_other" name="insuranceCostOther" lay-verify="required" id="fuelConsumption_other">
                    </select>
                </td>
            </tr>
            <tr>
                <td>油耗/小时</td>
                <td><label style="width: 100%;text-align: left" id="OilConsumptionShantui" class="layui-form-label"></label></td>
                <td><label style="width: 100%;text-align: left" id="OilConsumptionOther"  class="layui-form-label"></label></td>
            </tr>
            <tr>
                <td>燃油价格￥</td>
                <td><label style="width: 100%;text-align: left" id="fuelPriceShantui" class="layui-form-label"></label></td>
                <td><label style="width: 100%;text-align: left" id="fuelPriceOther"  class="layui-form-label"></label></td>
            </tr>
            <tr>
                <td style="font-weight: bold;">燃油成本/小时</td>
                <td><label style="width: 100%;text-align: left" id="fuelCostShantui" class="layui-form-label"></label></td>
                <td><label style="width: 100%;text-align: left" id="fuelCostOther"  class="layui-form-label"></label></td>
            </tr>
            <tr>
                <td>润滑油、润滑脂使用条件</td>
                <td>
                    <select lay-filter="greaseCondition_shantui" name="greaseConditionShantui" lay-verify="required" id="greaseCondition_shantui">
                        <option value="">请选择</option>
                        <option value="1">正常</option>
                        <option value="1.25">灰尘</option>
                        <option value="1.25">泥泞</option>
                        <option value="1.25">湿地</option>
                    </select>
                </td>
                <td>
                    <select lay-filter="greaseCondition_other" name="greaseConditionOther" lay-verify="required" id="greaseCondition_other">
                        <option value="">请选择</option>
                        <option value="1">正常</option>
                        <option value="1.25">灰尘</option>
                        <option value="1.25">泥泞</option>
                        <option value="1.25">湿地</option>
                    </select>
                </td>
            </tr>
            <tr>
                <td>系数（乘以基本成本）</td>
                <td><label style="width: 100%;text-align: left" id="coefficientShantui" class="layui-form-label"></label></td>
                <td><label style="width: 100%;text-align: left" id="coefficientOther"  class="layui-form-label"></label></td>
            </tr>
            <tr>
                <td>计算方法</td>
                <td>
                    <select lay-filter="greaseComputation_shantui" name="greaseComputationShantui" lay-verify="required" id="greaseComputation_shantui">
                        <option value="">请选择</option>
                        <option value="1">简单</option>
                        <option value="2">标准</option>
                        <option value="3">详细</option>
                    </select>
                </td>
                <td>
                    <select lay-filter="greaseComputation_other" name="greaseComputationOther" lay-verify="required" id="greaseComputation_other">
                        <option value="">请选择</option>
                        <option value="1">简单</option>
                        <option value="2">标准</option>
                        <option value="3">详细</option>
                    </select>
                </td>
            </tr>
            <tr>
                <td colspan="3" style="text-align: left;font-weight: bold;">简单计算方法</td>
            </tr>
            <tr class="greaseCostSimple">
                <td>润滑油及人工成本/小时(简单)</td>
                <td><input type="text" class="layui-input greaseCostSimpleShantui" id="greaseCostSimpleShantui" name="greaseCostSimpleShantui" autocomplete="off" placeholder="请输入润滑油及人工成本"></td>
                <td><input type="text" class="layui-input greaseCostSimpleOther" id="greaseCostSimpleOther" name="greaseCostSimpleOther" autocomplete="off" placeholder="请输入润滑油及人工成本"></td>
            </tr>
            <tr>
                <td colspan="3" style="text-align: left;font-weight: bold;">标准计算方法</td>
            </tr>
            <tr class="greaseCostStandard">
                <td>润滑油成本/小时(标准)</td>
                <td><input type="text" class="layui-input greaseCostStandardShantui" id="greaseCostStandardShantui" name="greaseCostStandardShantui" autocomplete="off" placeholder="请输入润滑油成本"></td>
                <td><input type="text" class="layui-input greaseCostStandardOther" id="greaseCostStandardOther" name="greaseCostStandardOther" autocomplete="off" placeholder="请输入润滑油成本"></td>
            </tr>
            <tr class="greaseCostStandard">
                <td>添加润滑油人工成本/小时(标准)</td>
                <td><input type="text" class="layui-input greaseCostStandardShantui" id="greaseAddCostStandardShantui" name="greaseAddCostStandardShantui" autocomplete="off" placeholder="请输入添加润滑油人工成本"></td>
                <td><input type="text" class="layui-input greaseCostStandardOther" id="greaseAddCostStandardOther" name="greaseAddCostStandardOther" autocomplete="off" placeholder="请输入添加润滑油人工成本"></td>
            </tr>
            <tr class="greaseCostStandard">
                <td>润滑油及人工成本/小时(标准)</td>
                <td><label style="width: 100%;text-align: left" id="greaseCostStandardShantui" class="layui-form-label"></label></td>
                <td><label style="width: 100%;text-align: left" id="greaseCostStandardOther"  class="layui-form-label"></label></td>
            </tr>
            <tr>
                <td colspan="3" style="text-align: left;font-weight: bold;">详细计算方法</td>
            </tr>
            <tr>
                <td>机油：更换周期（小时）</td>
                <td><label style="width: 100%;text-align: left" id="machineOilCycleShantui" class="layui-form-label greaseComputationDetailShantui"></label></td>
                <td><label style="width: 100%;text-align: left" id="machineOilCycleOther"  class="layui-form-label greaseComputationDetailOther"></label></td>
            </tr>
            <tr>
                <td>机油：换油量</td>
                <td><label style="width: 100%;text-align: left" id="machineOilQuantityShantui" class="layui-form-label greaseComputationDetailShantui"></label></td>
                <td><label style="width: 100%;text-align: left" id="machineOilQuantityOther"  class="layui-form-label greaseComputationDetailOther"></label></td>
            </tr>
            <tr>
                <td>机油：机油价格</td>
                <td><label style="width: 100%;text-align: left" id="machineOilPriceShantui" class="layui-form-label greaseComputationDetailShantui"></label></td>
                <td><label style="width: 100%;text-align: left" id="machineOilPriceOther"  class="layui-form-label greaseComputationDetailOther"></label></td>
            </tr>
            <tr>
                <td>机油：换油所需时间（min）</td>
                <td><label style="width: 100%;text-align: left" id="machineOilChangeTimeShantui" class="layui-form-label greaseComputationDetailShantui"></label></td>
                <td><label style="width: 100%;text-align: left" id="machineOilChangeTimeOther"  class="layui-form-label greaseComputationDetailOther"></label></td>
            </tr>
            <tr>
                <td>传动/行走油：更换周期（小时）</td>
                <td><label style="width: 100%;text-align: left" id="transmissionOilCycleShantui" class="layui-form-label greaseComputationDetailShantui"></label></td>
                <td><label style="width: 100%;text-align: left" id="transmissionOilCycleOther"  class="layui-form-label greaseComputationDetailOther"></label></td>
            </tr>
            <tr>
                <td>传动/行走油：换油量</td>
                <td><label style="width: 100%;text-align: left" id="transmissionOilQuantityShantui" class="layui-form-label greaseComputationDetailShantui"></label></td>
                <td><label style="width: 100%;text-align: left" id="transmissionOilQuantityOther"  class="layui-form-label greaseComputationDetailOther"></label></td>
            </tr>
            <tr>
                <td>传动/行走油：机油价格</td>
                <td><label style="width: 100%;text-align: left" id="transmissionOilPriceShantui" class="layui-form-label greaseComputationDetailShantui"></label></td>
                <td><label style="width: 100%;text-align: left" id="transmissionOilPriceOther"  class="layui-form-label greaseComputationDetailOther"></label></td>
            </tr>
            <tr>
                <td>传动/行走油：换油所需时间（min）</td>
                <td><label style="width: 100%;text-align: left" id="transmissionOilChangeTimeShantui" class="layui-form-label greaseComputationDetailShantui"></label></td>
                <td><label style="width: 100%;text-align: left" id="transmissionOilChangeTimeOther"  class="layui-form-label greaseComputationDetailOther"></label></td>
            </tr>
            <tr>
                <td>终传动油：更换周期（小时）</td>
                <td><label style="width: 100%;text-align: left" id="finaldriveOilCycleShantui" class="layui-form-label greaseComputationDetailShantui"></label></td>
                <td><label style="width: 100%;text-align: left" id="finaldriveOilCycleOther"  class="layui-form-label greaseComputationDetailOther"></label></td>
            </tr>
            <tr>
                <td>终传动油：换油量</td>
                <td><label style="width: 100%;text-align: left" id="finaldriveOilQuantityShantui" class="layui-form-label greaseComputationDetailShantui"></label></td>
                <td><label style="width: 100%;text-align: left" id="finaldriveOilQuantityOther"  class="layui-form-label greaseComputationDetailOther"></label></td>
            </tr>
            <tr>
                <td>终传动油：机油价格</td>
                <td><label style="width: 100%;text-align: left" id="finaldriveOilPriceShantui" class="layui-form-label greaseComputationDetailShantui"></label></td>
                <td><label style="width: 100%;text-align: left" id="finaldriveOilPriceOther"  class="layui-form-label greaseComputationDetailOther"></label></td>
            </tr>
            <tr>
                <td>终传动油：换油所需时间（min）</td>
                <td><label style="width: 100%;text-align: left" id="finaldriveOilChangeTimeShantui" class="layui-form-label greaseComputationDetailShantui"></label></td>
                <td><label style="width: 100%;text-align: left" id="finaldriveOilChangeTimeOther"  class="layui-form-label greaseComputationDetailOther"></label></td>
            </tr>
            <tr>
                <td>工作液压油：更换周期（小时）</td>
                <td><label style="width: 100%;text-align: left" id="hydraulicOilCycleShantui" class="layui-form-label greaseComputationDetailShantui"></label></td>
                <td><label style="width: 100%;text-align: left" id="hydraulicOilCycleOther"  class="layui-form-label greaseComputationDetailOther"></label></td>
            </tr>
            <tr>
                <td>工作液压油：换油量</td>
                <td><label style="width: 100%;text-align: left" id="hydraulicOilQuantityShantui" class="layui-form-label greaseComputationDetailShantui"></label></td>
                <td><label style="width: 100%;text-align: left" id="hydraulicOilQuantityOther"  class="layui-form-label greaseComputationDetailOther"></label></td>
            </tr>
            <tr>
                <td>工作液压油：机油价格</td>
                <td><label style="width: 100%;text-align: left" id="hydraulicOilPriceShantui" class="layui-form-label greaseComputationDetailShantui"></label></td>
                <td><label style="width: 100%;text-align: left" id="hydraulicOilPriceOther"  class="layui-form-label greaseComputationDetailOther"></label></td>
            </tr>
            <tr>
                <td>工作液压油：换油所需时间（min）</td>
                <td><label style="width: 100%;text-align: left" id="hydraulicOilChangeTimeShantui" class="layui-form-label greaseComputationDetailShantui"></label></td>
                <td><label style="width: 100%;text-align: left" id="hydraulicOilChangeTimeOther"  class="layui-form-label greaseComputationDetailOther"></label></td>
            </tr>
            <tr>
                <td>冷却液：更换周期（小时）</td>
                <td><label style="width: 100%;text-align: left" id="coolantCycleShantui" class="layui-form-label greaseComputationDetailShantui"></label></td>
                <td><label style="width: 100%;text-align: left" id="coolantCycleOther"  class="layui-form-label greaseComputationDetailOther"></label></td>
            </tr>
            <tr>
                <td>冷却液：换油量</td>
                <td><label style="width: 100%;text-align: left" id="coolantQuantityShantui" class="layui-form-label greaseComputationDetailShantui"></label></td>
                <td><label style="width: 100%;text-align: left" id="coolantQuantityOther"  class="layui-form-label greaseComputationDetailOther"></label></td>
            </tr>
            <tr>
                <td>冷却液：机油价格</td>
                <td><label style="width: 100%;text-align: left" id="coolantPriceShantui" class="layui-form-label greaseComputationDetailShantui"></label></td>
                <td><label style="width: 100%;text-align: left" id="coolantPriceOther"  class="layui-form-label greaseComputationDetailOther"></label></td>
            </tr>
            <tr>
                <td>冷却液：换油所需时间（min）</td>
                <td><label style="width: 100%;text-align: left" id="coolantChangeTimeShantui" class="layui-form-label greaseComputationDetailShantui"></label></td>
                <td><label style="width: 100%;text-align: left" id="coolantChangeTimeOther"  class="layui-form-label greaseComputationDetailOther"></label></td>
            </tr>
            <tr>
                <td>润滑脂加注：加注周期（小时）</td>
                <td><label style="width: 100%;text-align: left" id="greaseCycleShantui" class="layui-form-label greaseComputationDetailShantui"></label></td>
                <td><label style="width: 100%;text-align: left" id="greaseCycleOther"  class="layui-form-label greaseComputationDetailOther"></label></td>
            </tr>
            <tr>
                <td>润滑脂加注：加注量</td>
                <td><label style="width: 100%;text-align: left" id="greaseQuantityShantui" class="layui-form-label greaseComputationDetailShantui"></label></td>
                <td><label style="width: 100%;text-align: left" id="greaseQuantityOther"  class="layui-form-label greaseComputationDetailOther"></label></td>
            </tr>
            <tr>
                <td>润滑脂加注：润滑脂成本</td>
                <td><label style="width: 100%;text-align: left" id="greasePriceShantui" class="layui-form-label greaseComputationDetailShantui"></label></td>
                <td><label style="width: 100%;text-align: left" id="greasePriceOther"  class="layui-form-label greaseComputationDetailOther"></label></td>
            </tr>
            <tr>
                <td>润滑脂加注：润滑脂加注所需时间（min）</td>
                    <td><label style="width: 100%;text-align: left" id="greaseChangeTimeShantui" class="layui-form-label greaseComputationDetailShantui"></label></td>
                <td><label style="width: 100%;text-align: left" id="greaseChangeTimeOther"  class="layui-form-label greaseComputationDetailOther"></label></td>
            </tr>
            <tr>
                <td>润滑油成本/小时</td>
                <td><label style="width: 100%;text-align: left" id="greaseCostDetailShantui" class="layui-form-label greaseComputationDetailShantui"></label></td>
                <td><label style="width: 100%;text-align: left" id="greaseCostDetailOther"  class="layui-form-label greaseComputationDetailOther"></label></td>
            </tr>
            <tr>
                <td>更换润滑油人工成本/小时</td>
                <td><label style="width: 100%;text-align: left" id="greaseAddCostDetailShantui" class="layui-form-label greaseComputationDetailShantui"></label></td>
                <td><label style="width: 100%;text-align: left" id="greaseAddCostDetailOther"  class="layui-form-label greaseComputationDetailOther"></label></td>
            </tr>
            <tr>
                <td style="font-weight: bold;">润滑油及人工成本/小时（使用系数）</td>
                <td><label style="width: 100%;text-align: left" id="greaseCostShantui" class="layui-form-label greaseComputationDetailShantui"></label></td>
                <td><label style="width: 100%;text-align: left" id="greaseCostOther"  class="layui-form-label greaseComputationDetailOther"></label></td>
            </tr>
            <tr>
                <td>滤芯使用条件</td>
                <td>
                    <select lay-filter="filterCondition_shantui" name="filterConditionShantui" lay-verify="required" id="filterCondition_shantui">
                        <option value="">请选择</option>
                        <option value="1">正常</option>
                        <option value="1.25">灰尘</option>
                    </select>
                </td>
                <td>
                    <select lay-filter="filterCondition_other" name="filterConditionOther" lay-verify="required" id="filterCondition_other">
                        <option value="">请选择</option>
                        <option value="1">正常</option>
                        <option value="1.25">灰尘</option>
                    </select>
                </td>
            </tr>
            <tr>
                <td>系数（乘以基本成本）</td>
                <td><label style="width: 100%;text-align: left" id="filterCoefficientShantui" class="layui-form-label"></label></td>
                <td><label style="width: 100%;text-align: left" id="filterCoefficientOther"  class="layui-form-label"></label></td>
            </tr>
            <tr>
                <td>计算方法</td>
                <td>
                    <select lay-filter="filterComputation_shantui" name="filterComputationShantui" lay-verify="required" id="filterComputation_shantui">
                        <option value="">请选择</option>
                        <option value="1">简单</option>
                        <option value="2">标准</option>
                        <option value="3">详细</option>
                    </select>
                </td>
                <td>
                    <select lay-filter="filterComputation_other" name="filterComputationOther" lay-verify="required" id="filterComputation_other">
                        <option value="">请选择</option>
                        <option value="1">简单</option>
                        <option value="2">标准</option>
                        <option value="3">详细</option>
                    </select>
                </td>
            </tr>
            <tr>
                <td colspan="3" style="text-align: left;font-weight: bold;">滤芯费用简单计算方法</td>
            </tr>
            <tr>
                <td>滤芯费用/小时(简单)</td>
                <td><input type="text" class="layui-input filterCostSimpleShantui" id="filterCostSimpleShantui" name="filterCostSimpleShantui" autocomplete="off" placeholder="请输入滤芯费用"></td>
                <td><input type="text" class="layui-input filterCostSimpleOther" id="filterCostSimpleOther" name="filterCostSimpleOther" autocomplete="off" placeholder="请输入滤芯费用"></td>
            </tr>
            <tr>
                <td colspan="3" style="text-align: left;font-weight: bold;">滤芯费用标准计算方法</td>
            </tr>
            <tr>
                <td>与润滑油成本比例(标准)</td>
                <td><input type="text" class="layui-input filterCostProportionStandardShantui" id="filterCostProportionStandardShantui" name="filterCostProportionStandardShantui" autocomplete="off" placeholder="请输入与润滑油成本比例"></td>
                <td><input type="text" class="layui-input filterCostProportionStandardOther" id="filterCostProportionStandardOther" name="filterCostProportionStandardOther" autocomplete="off" placeholder="请输入与润滑油成本比例"></td>
            </tr>
            <tr class="greaseCostStandard">
                <td>滤芯费用/小时(标准)</td>
                <td><label style="width: 100%;text-align: left" id="filterCostStandardShantui" class="layui-form-label"></label></td>
                <td><label style="width: 100%;text-align: left" id="filterCostStandardOther"  class="layui-form-label"></label></td>
            </tr>
            <tr>
                <td colspan="3" style="text-align: left;font-weight: bold;">滤芯费用详细计算方法</td>
            </tr>
            <tr>
                <td>机油：滤芯更换周期（小时）</td>
                <td><label style="width: 100%;text-align: left" id="filterCycleShantui" class="layui-form-label filterClassShantui"></label></td>
                <td><label style="width: 100%;text-align: left" id="filterCycleOther"  class="layui-form-label filterClassOther"></label></td>
            </tr>
            <tr>
                <td>机油：滤芯更换数量</td>
                <td><label style="width: 100%;text-align: left" id="filterQuantityShantui" class="layui-form-label filterClassShantui"></label></td>
                <td><label style="width: 100%;text-align: left" id="filterQuantityOther"  class="layui-form-label filterClassOther"></label></td>
            </tr>
            <tr>
                <td>机油：滤芯价格</td>
                <td><label style="width: 100%;text-align: left" id="filterPriceShantui" class="layui-form-label filterClassShantui"></label></td>
                <td><label style="width: 100%;text-align: left" id="filterPriceOther"  class="layui-form-label filterClassOther"></label></td>
            </tr>
            <tr>
                <td>机油：更换滤芯所需时间（min）</td>
                <td><label style="width: 100%;text-align: left" id="filterChangeTimeShantui" class="layui-form-label filterClassShantui"></label></td>
                <td><label style="width: 100%;text-align: left" id="machineOilChangeTimeOther"  class="layui-form-label filterClassOther"></label></td>
            </tr>
            <tr>
                <td>传动/行走油：滤芯更换周期（小时）</td>
                <td><label style="width: 100%;text-align: left" id="transmissionOilCycleShantui" class="layui-form-label filterClassShantui"></label></td>
                <td><label style="width: 100%;text-align: left" id="transmissionOilCycleOther"  class="layui-form-label filterClassOther"></label></td>
            </tr>
            <tr>
                <td>传动/行走油：滤芯更换数量</td>
                <td><label style="width: 100%;text-align: left" id="transmissionOilQuantityShantui" class="layui-form-label filterClassShantui"></label></td>
                <td><label style="width: 100%;text-align: left" id="transmissionOilQuantityOther"  class="layui-form-label filterClassOther"></label></td>
            </tr>
            <tr>
                <td>传动/行走油：滤芯价格</td>
                <td><label style="width: 100%;text-align: left" id="transmissionOilPriceShantui" class="layui-form-label filterClassShantui"></label></td>
                <td><label style="width: 100%;text-align: left" id="transmissionOilPriceOther"  class="layui-form-label filterClassOther"></label></td>
            </tr>
            <tr>
                <td>传动/行走油：更换滤芯所需时间（min）</td>
                <td><label style="width: 100%;text-align: left" id="transmissionOilChangeTimeShantui" class="layui-form-label filterClassShantui"></label></td>
                <td><label style="width: 100%;text-align: left" id="transmissionOilChangeTimeOther"  class="layui-form-label filterClassOther"></label></td>
            </tr>
            <tr>
                <td>工作液压油：滤芯更换周期（小时）</td>
                <td><label style="width: 100%;text-align: left" id="finaldriveOilCycleShantui" class="layui-form-label filterClassShantui"></label></td>
                <td><label style="width: 100%;text-align: left" id="finaldriveOilCycleOther"  class="layui-form-label filterClassOther"></label></td>
            </tr>
            <tr>
                <td>工作液压油：滤芯更换数量</td>
                <td><label style="width: 100%;text-align: left" id="finaldriveOilQuantityShantui" class="layui-form-label filterClassShantui"></label></td>
                <td><label style="width: 100%;text-align: left" id="finaldriveOilQuantityOther"  class="layui-form-label filterClassOther"></label></td>
            </tr>
            <tr>
                <td>工作液压油：滤芯价格</td>
                <td><label style="width: 100%;text-align: left" id="finaldriveOilPriceShantui" class="layui-form-label filterClassShantui"></label></td>
                <td><label style="width: 100%;text-align: left" id="finaldriveOilPriceOther"  class="layui-form-label filterClassOther"></label></td>
            </tr>
            <tr>
                <td>工作液压油：更换滤芯所需时间（min）</td>
                <td><label style="width: 100%;text-align: left" id="finaldriveOilChangeTimeShantui" class="layui-form-label filterClassShantui"></label></td>
                <td><label style="width: 100%;text-align: left" id="finaldriveOilChangeTimeOther"  class="layui-form-label filterClassOther"></label></td>
            </tr>
            <tr>
                <td>燃油：滤芯更换周期（小时）</td>
                <td><label style="width: 100%;text-align: left" id="hydraulicOilCycleShantui" class="layui-form-label filterClassShantui"></label></td>
                <td><label style="width: 100%;text-align: left" id="hydraulicOilCycleOther"  class="layui-form-label filterClassOther"></label></td>
            </tr>
            <tr>
                <td>燃油：滤芯更换数量</td>
                <td><label style="width: 100%;text-align: left" id="hydraulicOilQuantityShantui" class="layui-form-label filterClassShantui"></label></td>
                <td><label style="width: 100%;text-align: left" id="hydraulicOilQuantityOther"  class="layui-form-label filterClassOther"></label></td>
            </tr>
            <tr>
                <td>燃油：滤芯价格</td>
                <td><label style="width: 100%;text-align: left" id="hydraulicOilPriceShantui" class="layui-form-label filterClassShantui"></label></td>
                <td><label style="width: 100%;text-align: left" id="hydraulicOilPriceOther"  class="layui-form-label filterClassOther"></label></td>
            </tr>
            <tr>
                <td>燃油：更换滤芯所需时间（min）</td>
                <td><label style="width: 100%;text-align: left" id="hydraulicOilChangeTimeShantui" class="layui-form-label filterClassShantui"></label></td>
                <td><label style="width: 100%;text-align: left" id="hydraulicOilChangeTimeOther"  class="layui-form-label filterClassOther"></label></td>
            </tr>
            <tr>
                <td>空气：滤芯更换周期（小时）</td>
                <td><label style="width: 100%;text-align: left" id="coolantCycleShantui" class="layui-form-label filterClassShantui"></label></td>
                <td><label style="width: 100%;text-align: left" id="coolantCycleOther"  class="layui-form-label filterClassOther"></label></td>
            </tr>
            <tr>
                <td>空气：滤芯更换数量</td>
                <td><label style="width: 100%;text-align: left" id="coolantQuantityShantui" class="layui-form-label filterClassShantui"></label></td>
                <td><label style="width: 100%;text-align: left" id="coolantQuantityOther"  class="layui-form-label filterClassOther"></label></td>
            </tr>
            <tr>
                <td>空气：滤芯价格</td>
                <td><label style="width: 100%;text-align: left" id="coolantPriceShantui" class="layui-form-label filterClassShantui"></label></td>
                <td><label style="width: 100%;text-align: left" id="coolantPriceOther"  class="layui-form-label filterClassOther"></label></td>
            </tr>
            <tr>
                <td>空气：更换滤芯所需时间（min）</td>
                <td><label style="width: 100%;text-align: left" id="coolantChangeTimeShantui" class="layui-form-label filterClassShantui"></label></td>
                <td><label style="width: 100%;text-align: left" id="coolantChangeTimeOther"  class="layui-form-label filterClassOther"></label></td>
            </tr>
            <tr>
                <td>冷却液：滤芯更换周期（小时）</td>
                <td><label style="width: 100%;text-align: left" id="greaseCycleShantui" class="layui-form-label filterClassShantui"></label></td>
                <td><label style="width: 100%;text-align: left" id="greaseCycleOther"  class="layui-form-label filterClassOther"></label></td>
            </tr>
            <tr>
                <td>冷却液：滤芯更换数量</td>
                <td><label style="width: 100%;text-align: left" id="greaseQuantityShantui" class="layui-form-label filterClassShantui"></label></td>
                <td><label style="width: 100%;text-align: left" id="greaseQuantityOther"  class="layui-form-label filterClassOther"></label></td>
            </tr>
            <tr>
                <td>冷却液：滤芯价格</td>
                <td><label style="width: 100%;text-align: left" id="greasePriceShantui" class="layui-form-label filterClassShantui"></label></td>
                <td><label style="width: 100%;text-align: left" id="greasePriceOther"  class="layui-form-label filterClassOther"></label></td>
            </tr>
            <tr>
                <td>冷却液：更换滤芯所需时间（min）</td>
                <td><label style="width: 100%;text-align: left" id="greaseChangeTimeShantui" class="layui-form-label filterClassShantui"></label></td>
                <td><label style="width: 100%;text-align: left" id="greaseChangeTimeOther"  class="layui-form-label filterClassOther"></label></td>
            </tr>
            <tr>
                <td>人工成本/小时</td>
                <td><label style="width: 100%;text-align: left" id="greaseCostDetailShantui" class="layui-form-label filterClassShantui"></label></td>
                <td><label style="width: 100%;text-align: left" id="greaseCostDetailOther"  class="layui-form-label filterClassOther"></label></td>
            </tr>
            <tr>
                <td>滤芯成本/小时</td>
                <td><label style="width: 100%;text-align: left" id="greaseAddCostDetailShantui" class="layui-form-label filterClassShantui"></label></td>
                <td><label style="width: 100%;text-align: left" id="greaseAddCostDetailOther"  class="layui-form-label filterClassOther"></label></td>
            </tr>
            <tr>
                <td>滤芯&人工成本/小时</td>
                <td><label style="width: 100%;text-align: left" id="greaseAddCostDetailShantui" class="layui-form-label filterClassShantui"></label></td>
                <td><label style="width: 100%;text-align: left" id="greaseAddCostDetailOther"  class="layui-form-label filterClassOther"></label></td>
            </tr>
            <tr>
                <td style="font-weight: bold;">滤芯成本/小时（使用系数）</td>
                <td><label style="width: 100%;text-align: left" id="greaseCostShantui" class="layui-form-label filterClassShantui"></label></td>
                <td><label style="width: 100%;text-align: left" id="greaseCostOther"  class="layui-form-label filterClassOther"></label></td>
            </tr>
            </tbody>
        </table>
    </div>
    <div class="layui-form-item" style="text-align: center">
        <div class="layui-input-block">
            <button class="layui-btn" lay-submit="" lay-filter="addUser">立即提交</button>
            <button type="reset" class="layui-btn layui-btn-primary">重置</button>
        </div>
    </div>
</form>
<script type="text/javascript" src="${base}/static/layui/layui.js"></script>
<script>
    layui.use(['form','jquery','layer'],function(){
        var form = layui.form,
                $ = layui.jquery,
                layer = layui.layer,
                delFlage = false;    //默认启用用户

        form.on("submit(addUser)",function(data){
            var loadIndex = layer.load(2, {
                shade: [0.3, '#333']
            });
            //给角色赋值
            delete data.field["roles"];
            var selectRole = [];
            $('input[name="roles"]:checked').each(function(){
                selectRole.push({"id":$(this).val()});
            });
            data.field.roleLists = selectRole;
            //判断用户是否启用
            if(undefined !== data.field.delFlag && null != data.field.delFlag){
                data.field.delFlag = false;
            }else{
                data.field.delFlag = true;
            }
            $.ajax({
                type:"POST",
                url:"${base}/admin/system/user/add",
                dataType:"json",
                contentType:"application/json",
                data:JSON.stringify(data.field),
                success:function(res){
                    layer.close(loadIndex);
                    if(res.success){
                        parent.layer.msg("用户添加成功!",{time:1500},function(){
                            //刷新父页面
                            parent.location.reload();
                        });
                    }else{
                        layer.msg(res.message);
                    }
                }
            });
            return false;
        });
        var deviceGreaseShantui;
        var deviceGreaseOther;
        form.on('select(device_shantui)', function(data) {
            var deviceDescShantui = $(data.elem).find("option:selected").attr("device_desc");
            var id = $(data.elem).find("option:selected").attr("value");
            $("#deviceDesc_shantui").text(deviceDescShantui);
            $.ajax({
                async: false, //改为同步请求
                url: '${base}/shantui/costAnalysis/getDeviceData',
                data: {
                    deviceId: id
                },
                dataType: 'json',
                type: 'post',
                success: function(result) {
                    var optionStr = "";
                    var deviceFuelList = result.data.deviceFuelConsumptions;
                    deviceGreaseShantui = result.data.deviceGrease;
                    //重新选择产品 油耗条件重新计算
                    $("#fuelConsumption_shantui").empty();
                    $("#fuelConsumption_shantui").append(new Option("请选择",""));
                    $("#OilConsumptionShantui").text('');
                    $("#fuelPriceShantui").text('');
                    //重新选择产品 燃油成本重新计算
                    $('#greaseComputation_shantui').val('')
                    $("#greaseCostStandardShantui").val('');
                    $("#greaseAddCostStandardShantui").val('');
                    $("#greaseCostSimpleShantui").val('');
                    $(".greaseComputationDetailShantui").text('');

                    $(deviceFuelList).each(function(index){
                        var data = deviceFuelList[index];

                        optionStr += "<option value='" + data.deviceId + "' fuel_price='"+ data.fuelPrice +"' fuel_consumption='"+ data.fuelConsumption +"'>"
                                    + data.fuelConsumptionIndex + "</option>";
                    });
                    $("#fuelConsumption_shantui").append(optionStr);
                    form.render();
                }
            });
        });
        form.on('select(fuelConsumption_shantui)', function(data) {
            var fuel_price = $(data.elem).find("option:selected").attr("fuel_price");
            var fuel_consumption = $(data.elem).find("option:selected").attr("fuel_consumption");
            $("#OilConsumptionShantui").text(fuel_consumption);
            $("#fuelPriceShantui").text(fuel_price);
        });

        form.on('select(device_other)', function(data) {
            var deviceDescOther = $(data.elem).find("option:selected").attr("device_desc");
            var id = $(data.elem).find("option:selected").attr("value");
            $("#deviceDesc_other").text(deviceDescOther);
            $.ajax({
                async: false, //改为同步请求
                url: '${base}/shantui/costAnalysis/getDeviceData',
                data: {
                    deviceId: id
                },
                dataType: 'json',
                type: 'post',
                success: function(result) {
                    var optionStr = "";
                    var deviceFuelList = result.data.deviceFuelConsumptions;
                    deviceGreaseOther = result.data.deviceGrease;
                    //重新选择产品 油耗条件重新计算
                    $("#fuelConsumption_other").empty();
                    $("#fuelConsumption_other").append(new Option("请选择",""));
                    $("#OilConsumptionOther").text('');
                    $("#fuelPriceOther").text('');
                    //重新选择产品 燃油成本重新计算
                    $('#greaseComputation_other').val('')
                    $("#greaseCostStandardOther").val('');
                    $("#greaseAddCostStandardOther").val('');
                    $("#greaseCostSimpleOther").val('');
                    $(".greaseComputationDetailOther").text('');

                    $(deviceFuelList).each(function(index){
                        var data = deviceFuelList[index];

                        optionStr += "<option value='" + data.deviceId + "' fuel_price='"+ data.fuelPrice +"' fuel_consumption='"+ data.fuelConsumption +"'>"
                                + data.fuelConsumptionIndex + "</option>";
                    });
                    $("#fuelConsumption_other").append(optionStr);
                    form.render();
                }
            });
        })

        form.on('select(fuelConsumption_other)', function(data) {
            var fuel_price = $(data.elem).find("option:selected").attr("fuel_price");
            var fuel_consumption = $(data.elem).find("option:selected").attr("fuel_consumption");
            $("#OilConsumptionOther").text(fuel_consumption);
            $("#fuelPriceOther").text(fuel_price);
        });

        //油耗条件(轻载、标准、重载)
        form.on('select(greaseCondition_shantui)', function(data) {
            var value = $(data.elem).find("option:selected").attr("value");
            $("#coefficientShantui").text(value);
        });

        form.on('select(greaseCondition_other)', function(data) {
            var value = $(data.elem).find("option:selected").attr("value");
            $("#coefficientOther").text(value);
        });

        //润滑油、润滑脂使用条件(简单、标准、详细)
        form.on('select(greaseComputation_shantui)', function(data) {
            var value = $(data.elem).find("option:selected").attr("value");
            $(".greaseComputationDetailShantui").text('');
            if('1' == value){//简单
                $(".greaseCostSimpleShantui").attr("disabled",false);
                $(".greaseCostStandardShantui").attr("disabled",true);
                $("#greaseCostStandardShantui").val('');
                $("#greaseAddCostStandardShantui").val('');
            }else if ('2' == value) {//标准
                $(".greaseCostStandardShantui").attr("disabled",false);
                $(".greaseCostSimpleShantui").attr("disabled",true);
                $("#greaseCostSimpleShantui").val('');
            }else if ('3' == value) {//详细
                $(".greaseCostSimpleShantui").attr("disabled",true);
                $(".greaseCostStandardShantui").attr("disabled",true);
                $("#greaseCostStandardShantui").val('');
                $("#greaseAddCostStandardShantui").val('');
                $("#greaseCostSimpleShantui").val('');
                $('#machineOilCycleShantui').text(deviceGreaseShantui.machineOilCycle);
                $('#machineOilQuantityShantui').text(deviceGreaseShantui.machineOilQuantity);
                $('#machineOilPriceShantui').text(deviceGreaseShantui.machineOilPrice);
                $('#machineOilChangeTimeShantui').text(deviceGreaseShantui.machineOilPrice);

                $('#transmissionOilCycleShantui').text(deviceGreaseShantui.transmissionOilCycle);
                $('#transmissionOilQuantityShantui').text(deviceGreaseShantui.transmissionOilQuantity);
                $('#transmissionOilPriceShantui').text(deviceGreaseShantui.transmissionOilPrice);
                $('#transmissionOilChangeTimeShantui').text(deviceGreaseShantui.transmissionOilChangeTime);

                $('#finaldriveOilCycleShantui').text(deviceGreaseShantui.finaldriveOilCycle);
                $('#finaldriveOilQuantityShantui').text(deviceGreaseShantui.finaldriveOilQuantity);
                $('#finaldriveOilPriceShantui').text(deviceGreaseShantui.finaldriveOilPrice);
                $('#finaldriveOilChangeTimeShantui').text(deviceGreaseShantui.finaldriveOilChangeTime);

                $('#hydraulicOilCycleShantui').text(deviceGreaseShantui.hydraulicOilCycle);
                $('#hydraulicOilQuantityShantui').text(deviceGreaseShantui.hydraulicOilQuantity);
                $('#hydraulicOilPriceShantui').text(deviceGreaseShantui.hydraulicOilPrice);
                $('#hydraulicOilChangeTimeShantui').text(deviceGreaseShantui.hydraulicOilChangeTime);

                $('#coolantCycleShantui').text(deviceGreaseShantui.coolantCycle);
                $('#coolantQuantityShantui').text(deviceGreaseShantui.coolantQuantity);
                $('#coolantPriceShantui').text(deviceGreaseShantui.coolantPrice);
                $('#coolantChangeTimeShantui').text(deviceGreaseShantui.coolantChangeTime);

                $('#greaseCycleShantui').text(deviceGreaseShantui.greaseCycle);
                $('#greaseQuantityShantui').text(deviceGreaseShantui.greaseQuantity);
                $('#greasePriceShantui').text(deviceGreaseShantui.greasePrice);
                $('#greaseChangeTimeShantui').text(deviceGreaseShantui.greaseChangeTime);
            }
        });

        form.on('select(greaseComputation_other)', function(data) {
            var value = $(data.elem).find("option:selected").attr("value");
            if('1' == value){//简单
                $(".greaseCostSimpleOther").attr("disabled",false);
                // $(".greaseCostStandard").attr("readOnly",true);
                $(".greaseCostStandardOther").attr("disabled",true);
            }else if ('2' == value) {//标准
                $(".greaseCostStandardOther").attr("disabled",false);
                $(".greaseCostSimpleOther").attr("disabled",true);
            }else if ('3' == value) {//详细
                $(".greaseCostSimpleOther").attr("disabled",true);
                $(".greaseCostStandardOther").attr("disabled",true);
                $("#greaseCostStandardOther").val('');
                $("#greaseAddCostStandardOther").val('');
                $("#greaseCostSimpleOther").val('');
                $('#machineOilCycleOther').text(deviceGreaseOther.machineOilCycle);
                $('#machineOilQuantityOther').text(deviceGreaseOther.machineOilQuantity);
                $('#machineOilPriceOther').text(deviceGreaseOther.machineOilPrice);
                $('#machineOilChangeTimeOther').text(deviceGreaseOther.machineOilPrice);

                $('#transmissionOilCycleOther').text(deviceGreaseOther.transmissionOilCycle);
                $('#transmissionOilQuantityOther').text(deviceGreaseOther.transmissionOilQuantity);
                $('#transmissionOilPriceOther').text(deviceGreaseOther.transmissionOilPrice);
                $('#transmissionOilChangeTimeOther').text(deviceGreaseOther.transmissionOilChangeTime);

                $('#finaldriveOilCycleOther').text(deviceGreaseOther.finaldriveOilCycle);
                $('#finaldriveOilQuantityOther').text(deviceGreaseOther.finaldriveOilQuantity);
                $('#finaldriveOilPriceOther').text(deviceGreaseOther.finaldriveOilPrice);
                $('#finaldriveOilChangeTimeOther').text(deviceGreaseOther.finaldriveOilChangeTime);

                $('#hydraulicOilCycleOther').text(deviceGreaseOther.hydraulicOilCycle);
                $('#hydraulicOilQuantityOther').text(deviceGreaseOther.hydraulicOilQuantity);
                $('#hydraulicOilPriceOther').text(deviceGreaseOther.hydraulicOilPrice);
                $('#hydraulicOilChangeTimeOther').text(deviceGreaseOther.hydraulicOilChangeTime);

                $('#coolantCycleOther').text(deviceGreaseOther.coolantCycle);
                $('#coolantQuantityOther').text(deviceGreaseOther.coolantQuantity);
                $('#coolantPriceOther').text(deviceGreaseOther.coolantPrice);
                $('#coolantChangeTimeOther').text(deviceGreaseOther.coolantChangeTime);

                $('#greaseCycleOther').text(deviceGreaseOther.greaseCycle);
                $('#greaseQuantityOther').text(deviceGreaseOther.greaseQuantity);
                $('#greasePriceOther').text(deviceGreaseOther.greasePrice);
                $('#greaseChangeTimeOther').text(deviceGreaseOther.greaseChangeTime);
            }
        });
    });
</script>
</body>
</html>