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
    <link rel="stylesheet" href="${base}/static/layui/css/layui.css" media="all"/>
    <style type="text/css">
        .layui-form-item .layui-inline {
            width: 33.333%;
            float: left;
            margin-right: 0;
        }

        @media (max-width: 1240px) {
            .layui-form-item .layui-inline {
                width: 100%;
                float: none;
            }
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

        .table-head {
            width: 100%;
            overflow-y: scroll;
        }

        .table-body {
            width: 100%;
            height: 650px;
            overflow-y: scroll;
        }

        .table-head table, .table-body table {
            width: 100%;
        }

        .table-body table tr:nth-child(2n+1) {
            background-color: #f2f2f2;
        }
    </style>
</head>
<body class="childrenBody">
<form class="layui-form">
    <div style="width: 100%">
        <div style="width:55%;float: left;margin-right: 10px">
            <div class="table-head">
                <table class="layui-table" style="margin-bottom: 2px;margin-top: 0px">
                    <colgroup>
                        <col width="150">
                        <col width="200">
                        <col width="200">
                    </colgroup>
                    <thead class="top-head">
                    <tr>
                        <th class="thead-tr-width"></th>
                        <th class="thead-tr-width" style="font-weight: bold;text-align: center">山推</th>
                        <th class="thead-tr-width" style="font-weight: bold;text-align: center">竞品</th>
                    </tr>
                    </thead>
                </table>
            </div>
            <div class="table-body layui-collapse">
                <div class="layui-colla-item">
                    <h2 class="layui-colla-title">设备信息</h2>
                    <div class="layui-colla-content layui-show">
                        <table class="layui-table" style="margin-top: 0px">
                            <colgroup>
                                <col width="150">
                                <col width="200">
                                <col width="200">
                            </colgroup>
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
                                    <select lay-filter="device_other" name="device_other" lay-verify="required" lay-search><option value="">直接选择或搜索选择</option>
                                <#list deviceListOther as device>
                                <option value="${device.id}" device_desc="${device.deviceDesc}">${device.deviceName}</option>
                                </#list>
                                    </select>
                                </td>
                            </tr>
                            <tr>
                                <td>设备描述</td>
                                <td id="deviceDesc_shantui"></td>
                                <td id="deviceDesc_other"></td>
                            </tr>
                            <tr>
                                <td>预计拥有年限（年）</td>
                                <td><input type="number" lay-verify="required|number" class="layui-input" id="years_shantui" name="years_shantui" autocomplete="off" placeholder="请输入拥有年限"
                                           oninput="zjcb_st();lxcb_st();bxcb_st();ccscb_st()"></td>
                                <td><input type="number" lay-verify="required|number" class="layui-input" id="years_other" name="years_other" autocomplete="off" placeholder="请输入拥有年限"
                                           oninput="zjcb_ot();lxcb_ot();bxcb_ot();ccscb_ot()"></td>
                            </tr>
                            <tr>
                                <td>预计工作时间（小时/年）</td>
                                <td><input type="number" lay-verify="required|number" class="layui-input" id="hours_shantui" name="hours_shantui" autocomplete="off" placeholder="请输入工作时间"
                                           oninput="zjcb_st();lxcb_st();bxcb_st();ccscb_st()"></td>
                                <td><input type="number" lay-verify="required|number" class="layui-input" id="hours_other" name="hours_other" autocomplete="off" placeholder="请输入工作时间"
                                           oninput="zjcb_ot();lxcb_ot();bxcb_ot();ccscb_ot()"></td>
                            </tr>
                            <tbody>
                        </table>
                    </div>
                </div>
                <div class="layui-colla-item">
                    <h2 class="layui-colla-title">拥有成本</h2>
                    <div class="layui-colla-content layui-show">
                        <table class="layui-table" style="margin-top: 0px">
                            <colgroup>
                                <col width="150">
                                <col width="200">
                                <col width="200">
                            </colgroup>
                            <tbody>
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
                                <td><input type="number" lay-verify="required|number" class="layui-input" name="paymentPriceShantui" id="paymentPriceShantui" autocomplete="off" placeholder="请输入支付价格" oninput="zjcb_st()"></td>
                                <td><input type="number" lay-verify="required|number" class="layui-input" name="paymentPriceOther" id="paymentPriceOther" autocomplete="off" placeholder="请输入支付价格" oninput="zjcb_ot()"></td>
                            </tr>
                            <tr>
                                <td>更换所有轮胎的价格</td>
                                <td><input type="number" lay-verify="required|number" class="layui-input" name="tireChangePriceShantui" id="tireChangePriceShantui" autocomplete="off" placeholder="请输入更换轮胎价格" oninput="zjcb_st()"></td>
                                <td><input type="number" lay-verify="required|number" class="layui-input" name="tireChangePriceOther" id="tireChangePriceOther" autocomplete="off" placeholder="请输入更换轮胎价格" oninput="zjcb_ot()"></td>
                            </tr>
                            <tr>
                                <td>以旧换新或转售价格</td>
                                <td><input type="number" lay-verify="required|number" class="layui-input" name="resalePriceShantui" id="resalePriceShantui" autocomplete="off" placeholder="请输入转售价格" oninput="zjcb_st()"></td>
                                <td><input type="number" lay-verify="required|number" class="layui-input" name="resalePriceOther" id="resalePriceOther" autocomplete="off" placeholder="请输入转售价格" oninput="zjcb_ot()"></td>
                            </tr>
                            <tr>
                                <td>折旧金额</td>
                                <td id="depreciationAmountShantui"></td>
                                <td id="depreciationAmountOther"></td>
                            </tr>
                            <tr>
                                <td>折旧成本/小时</td>
                                <td id="depreciationCostShantui"></td>
                                <td id="depreciationCostOther"></td>
                            </tr>
                            <tr>
                                <td>预计融资期</td>
                                <td><input type="number" lay-verify="required|number" class="layui-input" id="financingPeriodShantui" name="financingPeriodShantui" autocomplete="off" placeholder="请输入预计融资期" oninput="lxcb_st()"></td>
                                <td><input type="number" lay-verify="required|number" class="layui-input" id="financingPeriodOther" name="financingPeriodOther" autocomplete="off" placeholder="请输入预计融资期" oninput="lxcb_ot()"></td>
                            </tr>
                            <tr>
                                <td>利息率</td>
                                <td><input type="number" lay-verify="required|number" class="layui-input" id="rateShantui" name="rateShantui" autocomplete="off" placeholder="请输入利息率" oninput="lxcb_st()"></td>
                                <td><input type="number" lay-verify="required|number" class="layui-input" id="rateOther" name="rateOther" autocomplete="off" placeholder="请输入利息率" oninput="lxcb_ot()"></td>
                            </tr>
                            <tr>
                                <td>利息成本/小时</td>
                                <td id="rateCostShantui"></td>
                                <td id="rateCostOther"></td>
                            </tr>
                            <tr>
                                <td>保险率</td>
                                <td><input type="number" lay-verify="required|number" class="layui-input" id="insuranceRateShantui" name="insuranceRateShantui" autocomplete="off" placeholder="请输入保险率" oninput="bxcb_st()"></td>
                                <td><input type="number" lay-verify="required|number" class="layui-input" id="insuranceRateOther" name="insuranceRateOther" autocomplete="off" placeholder="请输入保险率" oninput="bxcb_ot()"></td>
                            </tr>
                            <tr>
                                <td>或每年成本</td>
                                <td><input type="number" lay-verify="required|number" class="layui-input" id="insuranceYearCostShantui" name="insuranceYearCostShantui" autocomplete="off" placeholder="请输入每年成本" oninput="bxcb_st()"></td>
                                <td><input type="number" lay-verify="required|number" class="layui-input" id="insuranceYearCostOther" name="insuranceYearCostOther" autocomplete="off" placeholder="请输入每年成本" oninput="bxcb_ot()"></td>
                            </tr>
                            <tr>
                                <td>保险成本/小时</td>
                                <td id="insuranceCostShantui"></td>
                                <td id="insuranceCostOther"></td>
                            </tr>
                            <tr>
                                <td>税率</td>
                                <td><input type="number" lay-verify="required|number" class="layui-input" id="taxRateShantui" name="taxRateShantui" autocomplete="off" placeholder="请输入税率" oninput="ccscb_st()"></td>
                                <td><input type="number" lay-verify="required|number" class="layui-input" id="taxRateOther" name="taxRateOther" autocomplete="off" placeholder="请输入税率" oninput="ccscb_ot()"></td>
                            </tr>
                            <tr>
                                <td>或每年成本</td>
                                <td><input type="number" lay-verify="required|number" class="layui-input" id="assetYearCostShantui" name="assetYearCostShantui" autocomplete="off" placeholder="请输入每年成本" oninput="ccscb_st()"></td>
                                <td><input type="number" lay-verify="required|number" class="layui-input" id="assetYearCostOther" name="assetYearCostOther" autocomplete="off" placeholder="请输入每年成本" oninput="ccscb_ot()"></td>
                            </tr>
                            <tr>
                                <td>财产税成本/小时</td>
                                <td id="assetRateCostShantui"></td>
                                <td id="assetRateCostOther"></td>
                            </tr>
                            <tr>
                                <td style="font-weight: bold;">总拥有成本/小时</td>
                                <td id="ownCostShantui"></td>
                                <td id="ownCostOther"></td>
                            </tr>
                            <tbody>
                        </table>
                    </div>
                </div>
                <div class="layui-colla-item">
                    <h2 class="layui-colla-title">使用成本-油耗条件</h2>
                    <div class="layui-colla-content layui-show">
                        <table class="layui-table" style="margin-top: 0px">
                            <colgroup>
                                <col width="150">
                                <col width="200">
                                <col width="200">
                            </colgroup>
                            <tbody>
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
                                <td id="OilConsumptionShantui"></td>
                                <td id="OilConsumptionOther"></td>
                            </tr>
                            <tr>
                                <td>燃油价格￥</td>
                                <td id="fuelPriceShantui"></td>
                                <td id="fuelPriceOther"></td>
                            </tr>
                            <tr>
                                <td style="font-weight: bold;">燃油成本/小时</td>
                                <td id="fuelCostShantui"></td>
                                <td id="fuelCostOther"></td>
                            </tr>
                            </tbody>
                        </table>
                    </div>
                </div>
                <div class="layui-colla-item">
                    <h2 class="layui-colla-title">使用成本-润滑油、润滑脂使用条件</h2>
                    <div class="layui-colla-content layui-show">
                        <table class="layui-table" style="margin-top: 0px">
                            <colgroup>
                                <col width="150">
                                <col width="200">
                                <col width="200">
                            </colgroup>
                            <tbody>
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
                            </tbody>
                        </table>
                    </div>
                </div>
                <div class="layui-colla-item">
                    <h2 class="layui-colla-title">使用成本-滤芯使用条件</h2>
                    <div class="layui-colla-content layui-show">
                        <table class="layui-table" style="margin-top: 0px">
                            <colgroup>
                                <col width="150">
                                <col width="200">
                                <col width="200">
                            </colgroup>
                            <tbody>
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
                                <td><input type="text" class="layui-input filterCostStandardShantui" id="filterCostProportionStandardShantui" name="filterCostProportionStandardShantui" autocomplete="off" placeholder="请输入与润滑油成本比例"></td>
                                <td><input type="text" class="layui-input filterCostStandardOther" id="filterCostProportionStandardOther" name="filterCostProportionStandardOther" autocomplete="off" placeholder="请输入与润滑油成本比例"></td>
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
                                <td><label style="width: 100%;text-align: left" id="machineOilFilterCycleShantui" class="layui-form-label filterClassShantui"></label></td>
                                <td><label style="width: 100%;text-align: left" id="machineOilFilterCycleOther"  class="layui-form-label filterClassOther"></label></td>
                            </tr>
                            <tr>
                                <td>机油：滤芯更换数量</td>
                                <td><label style="width: 100%;text-align: left" id="machineOilFilterQuantityShantui" class="layui-form-label filterClassShantui"></label></td>
                                <td><label style="width: 100%;text-align: left" id="machineOilFilterQuantityOther"  class="layui-form-label filterClassOther"></label></td>
                            </tr>
                            <tr>
                                <td>机油：滤芯价格</td>
                                <td><label style="width: 100%;text-align: left" id="machineOilFilterPriceShantui" class="layui-form-label filterClassShantui"></label></td>
                                <td><label style="width: 100%;text-align: left" id="machineOilFilterPriceOther"  class="layui-form-label filterClassOther"></label></td>
                            </tr>
                            <tr>
                                <td>机油：更换滤芯所需时间（min）</td>
                                <td><label style="width: 100%;text-align: left" id="machineOilFilterChangeTimeShantui" class="layui-form-label filterClassShantui"></label></td>
                                <td><label style="width: 100%;text-align: left" id="machineOilFilterChangeTimeOther"  class="layui-form-label filterClassOther"></label></td>
                            </tr>
                            <tr>
                                <td>传动/行走油：滤芯更换周期（小时）</td>
                                <td><label style="width: 100%;text-align: left" id="transmissionOilFilterCycleShantui" class="layui-form-label filterClassShantui"></label></td>
                                <td><label style="width: 100%;text-align: left" id="transmissionOilFilterCycleOther"  class="layui-form-label filterClassOther"></label></td>
                            </tr>
                            <tr>
                                <td>传动/行走油：滤芯更换数量</td>
                                <td><label style="width: 100%;text-align: left" id="transmissionOilFilterQuantityShantui" class="layui-form-label filterClassShantui"></label></td>
                                <td><label style="width: 100%;text-align: left" id="transmissionOilFilterQuantityOther"  class="layui-form-label filterClassOther"></label></td>
                            </tr>
                            <tr>
                                <td>传动/行走油：滤芯价格</td>
                                <td><label style="width: 100%;text-align: left" id="transmissionOilFilterPriceShantui" class="layui-form-label filterClassShantui"></label></td>
                                <td><label style="width: 100%;text-align: left" id="transmissionOilFilterPriceOther"  class="layui-form-label filterClassOther"></label></td>
                            </tr>
                            <tr>
                                <td>传动/行走油：更换滤芯所需时间（min）</td>
                                <td><label style="width: 100%;text-align: left" id="transmissionOilFilterChangeTimeShantui" class="layui-form-label filterClassShantui"></label></td>
                                <td><label style="width: 100%;text-align: left" id="transmissionOilFilterChangeTimeOther"  class="layui-form-label filterClassOther"></label></td>
                            </tr>
                            <tr>
                                <td>工作液压油：滤芯更换周期（小时）</td>
                                <td><label style="width: 100%;text-align: left" id="finaldriveOilFilterCycleShantui" class="layui-form-label filterClassShantui"></label></td>
                                <td><label style="width: 100%;text-align: left" id="finaldriveOilFilterCycleOther"  class="layui-form-label filterClassOther"></label></td>
                            </tr>
                            <tr>
                                <td>工作液压油：滤芯更换数量</td>
                                <td><label style="width: 100%;text-align: left" id="finaldriveOilFilterQuantityShantui" class="layui-form-label filterClassShantui"></label></td>
                                <td><label style="width: 100%;text-align: left" id="finaldriveOilFilterQuantityOther"  class="layui-form-label filterClassOther"></label></td>
                            </tr>
                            <tr>
                                <td>工作液压油：滤芯价格</td>
                                <td><label style="width: 100%;text-align: left" id="finaldriveOilFilterPriceShantui" class="layui-form-label filterClassShantui"></label></td>
                                <td><label style="width: 100%;text-align: left" id="finaldriveOilFilterPriceOther"  class="layui-form-label filterClassOther"></label></td>
                            </tr>
                            <tr>
                                <td>工作液压油：更换滤芯所需时间（min）</td>
                                <td><label style="width: 100%;text-align: left" id="finaldriveOilFilterChangeTimeShantui" class="layui-form-label filterClassShantui"></label></td>
                                <td><label style="width: 100%;text-align: left" id="finaldriveOilFilterChangeTimeOther"  class="layui-form-label filterClassOther"></label></td>
                            </tr>
                            <tr>
                                <td>燃油：滤芯更换周期（小时）</td>
                                <td><label style="width: 100%;text-align: left" id="hydraulicOilFilterCycleShantui" class="layui-form-label filterClassShantui"></label></td>
                                <td><label style="width: 100%;text-align: left" id="hydraulicOilFilterCycleOther"  class="layui-form-label filterClassOther"></label></td>
                            </tr>
                            <tr>
                                <td>燃油：滤芯更换数量</td>
                                <td><label style="width: 100%;text-align: left" id="hydraulicOilFilterQuantityShantui" class="layui-form-label filterClassShantui"></label></td>
                                <td><label style="width: 100%;text-align: left" id="hydraulicOilFilterQuantityOther"  class="layui-form-label filterClassOther"></label></td>
                            </tr>
                            <tr>
                                <td>燃油：滤芯价格</td>
                                <td><label style="width: 100%;text-align: left" id="hydraulicOilFilterPriceShantui" class="layui-form-label filterClassShantui"></label></td>
                                <td><label style="width: 100%;text-align: left" id="hydraulicOilFilterPriceOther"  class="layui-form-label filterClassOther"></label></td>
                            </tr>
                            <tr>
                                <td>燃油：更换滤芯所需时间（min）</td>
                                <td><label style="width: 100%;text-align: left" id="hydraulicOilFilterChangeTimeShantui" class="layui-form-label filterClassShantui"></label></td>
                                <td><label style="width: 100%;text-align: left" id="hydraulicOilFilterChangeTimeOther"  class="layui-form-label filterClassOther"></label></td>
                            </tr>
                            <tr>
                                <td>空气：滤芯更换周期（小时）</td>
                                <td><label style="width: 100%;text-align: left" id="coolantFilterCycleShantui" class="layui-form-label filterClassShantui"></label></td>
                                <td><label style="width: 100%;text-align: left" id="coolantFilterCycleOther"  class="layui-form-label filterClassOther"></label></td>
                            </tr>
                            <tr>
                                <td>空气：滤芯更换数量</td>
                                <td><label style="width: 100%;text-align: left" id="coolantFilterQuantityShantui" class="layui-form-label filterClassShantui"></label></td>
                                <td><label style="width: 100%;text-align: left" id="coolantFilterQuantityOther"  class="layui-form-label filterClassOther"></label></td>
                            </tr>
                            <tr>
                                <td>空气：滤芯价格</td>
                                <td><label style="width: 100%;text-align: left" id="coolantFilterPriceShantui" class="layui-form-label filterClassShantui"></label></td>
                                <td><label style="width: 100%;text-align: left" id="coolantFilterPriceOther"  class="layui-form-label filterClassOther"></label></td>
                            </tr>
                            <tr>
                                <td>空气：更换滤芯所需时间（min）</td>
                                <td><label style="width: 100%;text-align: left" id="coolantFilterChangeTimeShantui" class="layui-form-label filterClassShantui"></label></td>
                                <td><label style="width: 100%;text-align: left" id="coolantFilterChangeTimeOther"  class="layui-form-label filterClassOther"></label></td>
                            </tr>
                            <tr>
                                <td>冷却液：滤芯更换周期（小时）</td>
                                <td><label style="width: 100%;text-align: left" id="greaseFilterCycleShantui" class="layui-form-label filterClassShantui"></label></td>
                                <td><label style="width: 100%;text-align: left" id="greaseFilterCycleOther"  class="layui-form-label filterClassOther"></label></td>
                            </tr>
                            <tr>
                                <td>冷却液：滤芯更换数量</td>
                                <td><label style="width: 100%;text-align: left" id="greaseFilterQuantityShantui" class="layui-form-label filterClassShantui"></label></td>
                                <td><label style="width: 100%;text-align: left" id="greaseFilterQuantityOther"  class="layui-form-label filterClassOther"></label></td>
                            </tr>
                            <tr>
                                <td>冷却液：滤芯价格</td>
                                <td><label style="width: 100%;text-align: left" id="greaseFilterPriceShantui" class="layui-form-label filterClassShantui"></label></td>
                                <td><label style="width: 100%;text-align: left" id="greaseFilterPriceOther"  class="layui-form-label filterClassOther"></label></td>
                            </tr>
                            <tr>
                                <td>冷却液：更换滤芯所需时间（min）</td>
                                <td><label style="width: 100%;text-align: left" id="greaseFilterChangeTimeShantui" class="layui-form-label filterClassShantui"></label></td>
                                <td><label style="width: 100%;text-align: left" id="greaseFilterChangeTimeOther"  class="layui-form-label filterClassOther"></label></td>
                            </tr>
                            <tr>
                                <td>人工成本/小时</td>
                                <td><label style="width: 100%;text-align: left" id="laborCostFilterShantui" class="layui-form-label filterClassShantui"></label></td>
                                <td><label style="width: 100%;text-align: left" id="laborCostFilterOther"  class="layui-form-label filterClassOther"></label></td>
                            </tr>
                            <tr>
                                <td>滤芯成本/小时</td>
                                <td><label style="width: 100%;text-align: left" id="filterCostDetailShantui" class="layui-form-label filterClassShantui"></label></td>
                                <td><label style="width: 100%;text-align: left" id="filterCostDetailOther"  class="layui-form-label filterClassOther"></label></td>
                            </tr>
                            <tr>
                                <td>滤芯&人工成本/小时</td>
                                <td><label style="width: 100%;text-align: left" id="filterAndlaborCostShantui" class="layui-form-label filterClassShantui"></label></td>
                                <td><label style="width: 100%;text-align: left" id="filterAndlaborCostOther"  class="layui-form-label filterClassOther"></label></td>
                            </tr>
                            <tr>
                                <td style="font-weight: bold;">滤芯成本/小时（使用系数）</td>
                                <td><label style="width: 100%;text-align: left" id="filterCoefficientCostShantui" class="layui-form-label filterClassShantui"></label></td>
                                <td><label style="width: 100%;text-align: left" id="filterCoefficientCostOther"  class="layui-form-label filterClassOther"></label></td>
                            </tr>
                            </tbody>
                        </table>
                    </div>
                </div>
            </div>
            <div class="layui-form-item" style="text-align: center">
                <div class="layui-input-block">
                    <button class="layui-btn" lay-submit="" lay-filter="addUser">立即提交</button>
                    <button type="reset" class="layui-btn layui-btn-primary">重置</button>
                </div>
            </div>
        </div>
        <div style="width:40%;float: left;">
            <table class="layui-table" style="margin-top: 0px;">
                <thead>
                <tr>
                    <th colspan="3" style="text-align: center;font-weight: bold;">成本汇总（人民币/元）</th>
                </tr>
                <tr>
                    <th style="text-align: center;width: 40%">成本条目</th>
                    <th style="text-align: center;width: 30%">山推</th>
                    <th style="text-align: center;width: 30%">竞品</th>
                </tr>
                </thead>
                <tbody>
                <tr>
                    <td>设备型号</td>
                    <td id="deviceSumShantui"></td>
                    <td id="deviceSumOther"></td>
                </tr>
                <tr>
                    <td>折旧成本/小时</td>
                    <td id="zjcbSumShantui"></td>
                    <td id="zjcbSumOther"></td>
                </tr>
                <tr>
                    <td>利息成本/小时</td>
                    <td id="lxcbSumShantui"></td>
                    <td id="lxcbSumOther"></td>
                </tr>
                <tr>
                    <td>保险成本/小时</td>
                    <td id="bxcbSumShantui"></td>
                    <td id="bxcbSumOther"></td>
                </tr>
                <tr>
                    <td>财产税成本/小时</td>
                    <td id="ccscbSumShantui"></td>
                    <td id="ccscbSumOther"></td>
                </tr>
                <tr>
                    <td style="font-weight: bold;">总拥有成本/小时</td>
                    <td id="totalOwnCostShantui"></td>
                    <td id="totalOwnCostOther"></td>
                </tr>
                <tr>
                    <td>燃油成本/小时</td>
                    <td id="fuelCostSumShantui"></td>
                    <td id="fuelCostSumOther"></td>
                </tr>
                <tr>
                    <td>润滑油及人工成本/小时（使用系数）</td>
                    <td></td>
                    <td></td>
                </tr>
                <tr>
                    <td>滤芯成本/小时（使用系数）</td>
                    <td></td>
                    <td></td>
                </tr>
                <tr>
                    <td>底盘、铲刀、链轨成本/小时</td>
                    <td></td>
                    <td></td>
                </tr>
                <tr>
                    <td>维修成本/小时</td>
                    <td></td>
                    <td></td>
                </tr>
                <tr>
                    <td>其他易损件成本/小时</td>
                    <td></td>
                    <td></td>
                </tr>
                <tr>
                    <td>操作手工资/小时</td>
                    <td></td>
                    <td></td>
                </tr>
                <tr>
                    <td style="font-weight: bold;">总使用成本/小时</td>
                    <td></td>
                    <td></td>
                </tr>
                <tr>
                    <td style="font-weight: bold;">拥有成本&使用成本/小时</td>
                    <td></td>
                    <td></td>
                </tr>
                </tbody>
            </table>
        </div>
    </div>

</form>
<script type="text/javascript" src="${base}/static/layui/layui.js"></script>
<script>
    layui.use(['form', 'jquery', 'layer', 'element'], function () {
        var form = layui.form,
                $ = layui.jquery,
                layer = layui.layer,
                element = layui.element,
                delFlage = false;    //默认启用用户

        form.on("submit(addUser)", function (data) {
            var loadIndex = layer.load(2, {
                shade: [0.3, '#333']
            });
            //给角色赋值
            delete data.field["roles"];
            var selectRole = [];
            $('input[name="roles"]:checked').each(function () {
                selectRole.push({"id": $(this).val()});
            });
            data.field.roleLists = selectRole;
            //判断用户是否启用
            if (undefined !== data.field.delFlag && null != data.field.delFlag) {
                data.field.delFlag = false;
            } else {
                data.field.delFlag = true;
            }
            $.ajax({
                type: "POST",
                url: "${base}/admin/system/user/add",
                dataType: "json",
                contentType: "application/json",
                data: JSON.stringify(data.field),
                success: function (res) {
                    layer.close(loadIndex);
                    if (res.success) {
                        parent.layer.msg("用户添加成功!", {time: 1500}, function () {
                            //刷新父页面
                            parent.location.reload();
                        });
                    } else {
                        layer.msg(res.message);
                    }
                }
            });
            return false;
        });
        var deviceGreaseShantui;
        var deviceGreaseOther;
        var deviceFilterShantui;
        var deviceFilterOther;
        var deviceChassisShantui;
        var deviceChassisOther;
        var deviceBladeShantui;
        var deviceBladeOther;
        var deviceTrackShantui;
        var deviceTrackOther;
        var deviceRepairShantui;
        var deviceRepairOther;
        form.on('select(device_shantui)', function (data) {
            var deviceDescShantui = $(data.elem).find("option:selected").attr("device_desc");
            var id = $(data.elem).find("option:selected").attr("value");
            var text = data.elem[data.elem.selectedIndex].text;
            $("#deviceDesc_shantui").text(deviceDescShantui);
            $.ajax({
                async: false, //改为同步请求
                url: '${base}/shantui/costAnalysis/getDeviceData',
                data: {
                    deviceId: id
                },
                dataType: 'json',
                type: 'post',
                success: function (result) {
                    var optionStr = "";
                    var deviceFuelList = result.data.deviceFuelConsumptions;//油耗
                    deviceGreaseShantui = result.data.deviceGrease;//润滑油
                    deviceFilterShantui = result.data.deviceFilter;//滤芯
                    deviceChassisShantui = result.data.deviceChassis;//底盘
                    deviceBladeShantui = result.data.deviceBlade;//铲刀
                    deviceTrackShantui = result.data.deviceTrack;//履带
                    deviceRepairShantui = result.data.deviceRepair;//维修数据
                    //重新选择产品 油耗条件重新计算
                    $("#fuelConsumption_shantui").empty();
                    $("#fuelConsumption_shantui").append(new Option("请选择", ""));
                    $("#OilConsumptionShantui").text('');
                    $("#fuelPriceShantui").text('');
                    //重新选择产品 燃油成本重新计算
                    $('#greaseComputation_shantui').val('')
                    $("#greaseCostStandardShantui").val('');
                    $("#greaseAddCostStandardShantui").val('');
                    $("#greaseCostSimpleShantui").val('');
                    $(".greaseComputationDetailShantui").text('');
                    //重新选择产品 滤芯成本重新计算
                    //汇总赋值
                    $("#deviceSumShantui").text(text);

                    $(deviceFuelList).each(function (index) {
                        var data = deviceFuelList[index];
                        optionStr += "<option value='" + data.id + "' fuel_price='" + data.fuelPrice + "' fuel_consumption='" + data.fuelConsumption + "'>"
                                + data.fuelConsumptionIndex + "</option>";
                    });
                    $("#fuelConsumption_shantui").append(optionStr);
                    form.render();
                }
            });
        });
        form.on('select(fuelConsumption_shantui)', function (data) {
            var fuel_price = $(data.elem).find("option:selected").attr("fuel_price");
            var fuel_consumption = $(data.elem).find("option:selected").attr("fuel_consumption");
            $("#OilConsumptionShantui").text(fuel_consumption);
            $("#fuelPriceShantui").text(fuel_price);
            if(fuel_price.length == 0){
                fuel_price = 0;
            }
            if(fuel_consumption.length == 0){
                fuel_consumption = 0;
            }
            var fuelCost = (fuel_price*fuel_consumption).toFixed(2);//燃油成本/小时
            $("#fuelCostShantui").text(fuelCost);
            $("#fuelCostSumShantui").text(fuelCost);
        });

        form.on('select(device_other)', function (data) {
            var deviceDescOther = $(data.elem).find("option:selected").attr("device_desc");
            var id = $(data.elem).find("option:selected").attr("value");
            var text = data.elem[data.elem.selectedIndex].text;
            $("#deviceDesc_other").text(deviceDescOther);
            $.ajax({
                async: false, //改为同步请求
                url: '${base}/shantui/costAnalysis/getDeviceData',
                data: {
                    deviceId: id
                },
                dataType: 'json',
                type: 'post',
                success: function (result) {
                    var optionStr = "";
                    var deviceFuelList = result.data.deviceFuelConsumptions;//油耗
                    deviceGreaseOther = result.data.deviceGrease;//润滑油
                    deviceFilterOther = result.data.deviceFilter;//滤芯
                    deviceChassisOther = result.data.deviceChassis;//底盘
                    deviceBladeOther = result.data.deviceBlade;//铲刀
                    deviceTrackOther = result.data.deviceTrack;//履带
                    deviceRepairOther = result.data.deviceRepair;//维修数据
                    //重新选择产品 油耗条件重新计算
                    $("#fuelConsumption_other").empty();
                    $("#fuelConsumption_other").append(new Option("请选择", ""));
                    $("#OilConsumptionOther").text('');
                    $("#fuelPriceOther").text('');
                    //重新选择产品 燃油成本重新计算
                    $('#greaseComputation_other').val('')
                    $("#greaseCostStandardOther").val('');
                    $("#greaseAddCostStandardOther").val('');
                    $("#greaseCostSimpleOther").val('');
                    $(".greaseComputationDetailOther").text('');

                    //汇总赋值
                    $("#deviceSumOther").text(text);

                    $(deviceFuelList).each(function (index) {
                        var data = deviceFuelList[index];

                        optionStr += "<option value='" + data.id + "' fuel_price='" + data.fuelPrice + "' fuel_consumption='" + data.fuelConsumption + "'>"
                                + data.fuelConsumptionIndex + "</option>";
                    });
                    $("#fuelConsumption_other").append(optionStr);
                    form.render();
                }
            });
        })

        form.on('select(fuelConsumption_other)', function (data) {
            var fuel_price = $(data.elem).find("option:selected").attr("fuel_price");
            var fuel_consumption = $(data.elem).find("option:selected").attr("fuel_consumption");
            $("#OilConsumptionOther").text(fuel_consumption);
            $("#fuelPriceOther").text(fuel_price);
            if(fuel_price.length == 0){
                fuel_price = 0;
            }
            if(fuel_consumption.length == 0){
                fuel_consumption = 0;
            }
            var fuelCost = (fuel_price*fuel_consumption).toFixed(2);//燃油成本/小时
            $("#fuelCostOther").text(fuelCost);
            $("#fuelCostSumOther").text(fuelCost);
        });

        //油耗条件(轻载、标准、重载)
        form.on('select(greaseCondition_shantui)', function (data) {
            var value = $(data.elem).find("option:selected").attr("value");
            $("#coefficientShantui").text(value);
        });

        form.on('select(greaseCondition_other)', function (data) {
            var value = $(data.elem).find("option:selected").attr("value");
            $("#coefficientOther").text(value);
        });

        //润滑油、润滑脂使用条件(简单、标准、详细)
        form.on('select(greaseComputation_shantui)', function (data) {
            var value = $(data.elem).find("option:selected").attr("value");
            $(".greaseComputationDetailShantui").text('');
            if ('1' == value) {//简单
                $(".greaseCostSimpleShantui").attr("disabled", false);
                $(".greaseCostStandardShantui").attr("disabled", true);
                $("#greaseCostStandardShantui").val('');
                $("#greaseAddCostStandardShantui").val('');
            } else if ('2' == value) {//标准
                $(".greaseCostStandardShantui").attr("disabled", false);
                $(".greaseCostSimpleShantui").attr("disabled", true);
                $("#greaseCostSimpleShantui").val('');
            } else if ('3' == value) {//详细
                $(".greaseCostSimpleShantui").attr("disabled", true);
                $(".greaseCostStandardShantui").attr("disabled", true);
                $("#greaseCostStandardShantui").val('');
                $("#greaseAddCostStandardShantui").val('');
                $("#greaseCostSimpleShantui").val('');
                $('#machineOilCycleShantui').text(deviceGreaseShantui.machineOilCycle);
                $('#machineOilQuantityShantui').text(deviceGreaseShantui.machineOilQuantity);
                $('#machineOilPriceShantui').text(deviceGreaseShantui.machineOilPrice);
                $('#machineOilChangeTimeShantui').text(deviceGreaseShantui.machineOilChangeTime);

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

        form.on('select(greaseComputation_other)', function (data) {
            var value = $(data.elem).find("option:selected").attr("value");
            if ('1' == value) {//简单
                $(".greaseCostSimpleOther").attr("disabled", false);
                // $(".greaseCostStandard").attr("readOnly",true);
                $(".greaseCostStandardOther").attr("disabled", true);
            } else if ('2' == value) {//标准
                $(".greaseCostStandardOther").attr("disabled", false);
                $(".greaseCostSimpleOther").attr("disabled", true);
            } else if ('3' == value) {//详细
                $(".greaseCostSimpleOther").attr("disabled", true);
                $(".greaseCostStandardOther").attr("disabled", true);
                $("#greaseCostStandardOther").val('');
                $("#greaseAddCostStandardOther").val('');
                $("#greaseCostSimpleOther").val('');
                $('#machineOilCycleOther').text(deviceGreaseOther.machineOilCycle);
                $('#machineOilQuantityOther').text(deviceGreaseOther.machineOilQuantity);
                $('#machineOilPriceOther').text(deviceGreaseOther.machineOilPrice);
                $('#machineOilChangeTimeOther').text(deviceGreaseOther.machineOilChangeTime);

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

        //滤芯使用条件(正常、灰尘)
        form.on('select(filterCondition_shantui)', function (data) {
            var value = $(data.elem).find("option:selected").attr("value");
            $("#filterCoefficientShantui").text(value);
        });

        form.on('select(filterCondition_other)', function (data) {
            var value = $(data.elem).find("option:selected").attr("value");
            $("#filterCoefficientOther").text(value);
        });

        //滤芯费用计算方法(简单、标准、详细)-山推
        form.on('select(filterComputation_shantui)', function (data) {
            var value = $(data.elem).find("option:selected").attr("value");
            $(".filterClassShantui").text('');
            if ('1' == value) {//简单
                $(".filterCostSimpleShantui").attr("disabled", false);
                $(".filterCostStandardShantui").attr("disabled", true);
                $("#filterCostProportionStandardShantui").val('');
            } else if ('2' == value) {//标准
                $(".filterCostStandardShantui").attr("disabled", false);
                $(".filterCostSimpleShantui").attr("disabled", true);
                $("#filterCostSimpleShantui").val('');
            } else if ('3' == value) {//详细
                $(".filterCostStandardShantui").attr("disabled", true);
                $(".filterCostSimpleShantui").attr("disabled", true);
                $("#filterCostSimpleShantui").val('');
                $("#filterCostProportionStandardShantui").val('');

                $('#machineOilFilterCycleShantui').text(deviceFilterShantui.machineOilFilteCycle);
                $('#machineOilFilterQuantityShantui').text(deviceFilterShantui.machineOilFilteNum);
                $('#machineOilFilterPriceShantui').text(deviceFilterShantui.machineOilFiltePrice);
                $('#machineOilFilterChangeTimeShantui').text(deviceFilterShantui.machineOilFilteChangeTime);

                $('#transmissionOilFilterCycleShantui').text(deviceFilterShantui.transmissionOilFilteCycle);
                $('#transmissionOilFilterQuantityShantui').text(deviceFilterShantui.transmissionOilFilteNum);
                $('#transmissionOilFilterPriceShantui').text(deviceFilterShantui.transmissionOilFiltePrice);
                $('#transmissionOilFilterChangeTimeShantui').text(deviceFilterShantui.transmissionOilFilteChangeTime);

                $('#finaldriveOilFilterCycleShantui').text(deviceFilterShantui.hydraulicOilFilteCycle);
                $('#finaldriveOilFilterQuantityShantui').text(deviceFilterShantui.hydraulicOilFilteNum);
                $('#finaldriveOilFilterPriceShantui').text(deviceFilterShantui.hydraulicOilFiltePrice);
                $('#finaldriveOilFilterChangeTimeShantui').text(deviceFilterShantui.hydraulicOilFilteChangeTime);

                $('#hydraulicOilFilterCycleShantui').text(deviceFilterShantui.fuelFilteCycle);
                $('#hydraulicOilFilterQuantityShantui').text(deviceFilterShantui.fuelFilteNum);
                $('#hydraulicOilFilterPriceShantui').text(deviceFilterShantui.fuelFiltePrice);
                $('#hydraulicOilFilterChangeTimeShantui').text(deviceFilterShantui.fuelFilteChangeTime);

                $('#coolantFilterCycleShantui').text(deviceFilterShantui.airFilterCycle);
                $('#coolantFilterQuantityShantui').text(deviceFilterShantui.airFilterNum);
                $('#coolantFilterPriceShantui').text(deviceFilterShantui.airFilterPrice);
                $('#coolantFilterChangeTimeShantui').text(deviceFilterShantui.airFilterChangeTime);

                $('#greaseFilterCycleShantui').text(deviceFilterShantui.coolantFilterCycle);
                $('#greaseFilterQuantityShantui').text(deviceFilterShantui.coolantFilterNum);
                $('#greaseFilterPriceShantui').text(deviceFilterShantui.coolantFilterPrice);
                $('#greaseFilterChangeTimeShantui').text(deviceFilterShantui.coolantFilterChangeTime);

                $('#laborCostFilterShantui').text(deviceFilterShantui.laborCostFilter);
            }
        });

        //滤芯费用计算方法(简单、标准、详细)-竞品
        form.on('select(filterComputation_other)', function (data) {
            var value = $(data.elem).find("option:selected").attr("value");
            $(".filterClassOther").text('');
            if ('1' == value) {//简单
                $(".filterCostSimpleOther").attr("disabled", false);
                $(".filterCostStandardOther").attr("disabled", true);
                $("#filterCostProportionStandardOther").val('');
            } else if ('2' == value) {//标准
                $(".filterCostStandardOther").attr("disabled", false);
                $(".filterCostSimpleOther").attr("disabled", true);
                $("#filterCostSimpleOther").val('');
            } else if ('3' == value) {//详细
                $(".filterCostStandardOther").attr("disabled", true);
                $(".filterCostSimpleOther").attr("disabled", true);
                $("#filterCostSimpleOther").val('');
                $("#filterCostProportionStandardOther").val('');

                $('#machineOilFilterCycleOther').text(deviceFilterOther.machineOilFilteCycle);
                $('#machineOilFilterQuantityOther').text(deviceFilterOther.machineOilFilteNum);
                $('#machineOilFilterPriceOther').text(deviceFilterOther.machineOilFiltePrice);
                $('#machineOilFilterChangeTimeOther').text(deviceFilterOther.machineOilFilteChangeTime);

                $('#transmissionOilFilterCycleOther').text(deviceFilterOther.transmissionOilFilteCycle);
                $('#transmissionOilFilterQuantityOther').text(deviceFilterOther.transmissionOilFilteNum);
                $('#transmissionOilFilterPriceOther').text(deviceFilterOther.transmissionOilFiltePrice);
                $('#transmissionOilFilterChangeTimeOther').text(deviceFilterOther.transmissionOilFilteChangeTime);

                $('#finaldriveOilFilterCycleOther').text(deviceFilterOther.hydraulicOilFilteCycle);
                $('#finaldriveOilFilterQuantityOther').text(deviceFilterOther.hydraulicOilFilteNum);
                $('#finaldriveOilFilterPriceOther').text(deviceFilterOther.hydraulicOilFiltePrice);
                $('#finaldriveOilFilterChangeTimeOther').text(deviceFilterOther.hydraulicOilFilteChangeTime);

                $('#hydraulicOilFilterCycleOther').text(deviceFilterOther.fuelFilteCycle);
                $('#hydraulicOilFilterQuantityOther').text(deviceFilterOther.fuelFilteNum);
                $('#hydraulicOilFilterPriceOther').text(deviceFilterOther.fuelFiltePrice);
                $('#hydraulicOilFilterChangeTimeOther').text(deviceFilterOther.fuelFilteChangeTime);

                $('#coolantFilterCycleOther').text(deviceFilterOther.airFilterCycle);
                $('#coolantFilterQuantityOther').text(deviceFilterOther.airFilterNum);
                $('#coolantFilterPriceOther').text(deviceFilterOther.airFilterPrice);
                $('#coolantFilterChangeTimeOther').text(deviceFilterOther.airFilterChangeTime);

                $('#greaseFilterCycleOther').text(deviceFilterOther.coolantFilterCycle);
                $('#greaseFilterQuantityOther').text(deviceFilterOther.coolantFilterNum);
                $('#greaseFilterPriceOther').text(deviceFilterOther.coolantFilterPrice);
                $('#greaseFilterChangeTimeOther').text(deviceFilterOther.coolantFilterChangeTime);

                $('#laborCostFilterOther').text(deviceFilterOther.laborCostFilter);
            }
        });

        var depreciationCostShantui = 0;//折旧成本
        //计算折旧成本
        window.zjcb_st = function (){
            //折旧金额=交付价格（包括附件）-更换所有轮胎的价格-以旧换新或转售价格
            var paymentPriceShantui = $('#paymentPriceShantui').val();//交付价格（包括附件）
            var tireChangePriceShantui = $('#tireChangePriceShantui').val();//更换所有轮胎的价格
            var resalePriceShantui = $('#resalePriceShantui').val();//以旧换新或转售价格
            var years_shantui = $('#years_shantui').val();//预计拥有年限（年）
            var hours_shantui = $('#hours_shantui').val();//预计工作时间（小时/年）
            if(paymentPriceShantui.length==0){
                paymentPriceShantui=0;
            }
            if(tireChangePriceShantui.length==0){
                tireChangePriceShantui=0;
            }
            if(resalePriceShantui.length==0){
                resalePriceShantui=0;
            }
            if(years_shantui.length==0){
                years_shantui=0;
            }
            if(hours_shantui.length==0){
                hours_shantui=0;
            }
            var depreciationAmountShantui = (paymentPriceShantui-tireChangePriceShantui-resalePriceShantui).toFixed(2);
            $('#depreciationAmountShantui').text(depreciationAmountShantui);
            //折旧成本=折旧金额/（预计拥有年限（年）*预计工作时间（小时/年））
            if(years_shantui*hours_shantui==0){
                depreciationCostShantui = 0;
            }else{
                depreciationCostShantui = (depreciationAmountShantui/(years_shantui*hours_shantui)).toFixed(2);
            }
            $('#depreciationCostShantui').text(depreciationCostShantui);
            $('#zjcbSumShantui').text(depreciationCostShantui);
            var totalCost = (parseFloat(depreciationCostShantui)+parseFloat(rateCostShantui)+parseFloat(insuranceCostShantui)+parseFloat(assetRateCostShantui)).toFixed(2);
            $('#ownCostShantui').text(totalCost);//总拥有成本
            $('#totalOwnCostShantui').text(totalCost);//总拥有成本
        }

        var rateCostShantui = 0;//利息成本
        //计算利息成本
        window.lxcb_st = function (){
            //折旧金额=交付价格（包括附件）-更换所有轮胎的价格-以旧换新或转售价格
            var paymentPriceShantui = $('#paymentPriceShantui').val();//交付价格（包括附件）
            var tireChangePriceShantui = $('#tireChangePriceShantui').val();//更换所有轮胎的价格
            var resalePriceShantui = $('#resalePriceShantui').val();//以旧换新或转售价格
            var years_shantui = $('#years_shantui').val();//预计拥有年限（年）
            var hours_shantui = $('#hours_shantui').val();//预计工作时间（小时/年）
            var financingPeriodShantui = $('#financingPeriodShantui').val();//预计融资期
            var rateShantui = $('#rateShantui').val();//利息率
            if(paymentPriceShantui.length==0){
                paymentPriceShantui=0;
            }
            if(tireChangePriceShantui.length==0){
                tireChangePriceShantui=0;
            }
            if(resalePriceShantui.length==0){
                resalePriceShantui=0;
            }
            if(years_shantui.length==0){
                years_shantui=0;
            }
            if(hours_shantui.length==0){
                hours_shantui=0;
            }
            if(financingPeriodShantui.length==0){
                financingPeriodShantui=0;
            }
            if(rateShantui.length==0){
                rateShantui=0;
            }
            //利息成本/小时 =（预计融资期+1）/（2*预计融资期）*（交付价格（包括附件）-更换所有轮胎的价格）*利息率/预计工作时间（小时/年）*(预计融资期/预计拥有年限（年）)

            if(years_shantui*hours_shantui==0){
                rateCostShantui = 0;
            }else{
                if(financingPeriodShantui == 0){
                    rateCostShantui = 0;
                }else{
                    rateCostShantui = ((parseFloat(financingPeriodShantui)+1)/(2*financingPeriodShantui)*(paymentPriceShantui-tireChangePriceShantui)*rateShantui/hours_shantui*(financingPeriodShantui/years_shantui)).toFixed(2);
                }
            }
            $('#rateCostShantui').text(rateCostShantui);
            $('#lxcbSumShantui').text(rateCostShantui);
            var totalCost = (parseFloat(depreciationCostShantui)+parseFloat(rateCostShantui)+parseFloat(insuranceCostShantui)+parseFloat(assetRateCostShantui)).toFixed(2);
            $('#ownCostShantui').text(totalCost);//总拥有成本
            $('#totalOwnCostShantui').text(totalCost);//总拥有成本
        }

        var insuranceCostShantui = 0;//保险成本
        //计算保险成本
        window.bxcb_st = function (){
            //折旧金额=交付价格（包括附件）-更换所有轮胎的价格-以旧换新或转售价格
            var paymentPriceShantui = $('#paymentPriceShantui').val();//交付价格（包括附件）
            var tireChangePriceShantui = $('#tireChangePriceShantui').val();//更换所有轮胎的价格
            var resalePriceShantui = $('#resalePriceShantui').val();//以旧换新或转售价格
            var years_shantui = $('#years_shantui').val();//预计拥有年限（年）
            var hours_shantui = $('#hours_shantui').val();//预计工作时间（小时/年）
            var insuranceRateShantui = $('#insuranceRateShantui').val();//保险率
            var insuranceYearCostShantui = $('#insuranceYearCostShantui').val();//每年成本
            if(paymentPriceShantui.length==0){
                paymentPriceShantui=0;
            }
            if(tireChangePriceShantui.length==0){
                tireChangePriceShantui=0;
            }
            if(resalePriceShantui.length==0){
                resalePriceShantui=0;
            }
            if(years_shantui.length==0){
                years_shantui=0;
            }
            if(hours_shantui.length==0){
                hours_shantui=0;
            }
            if(insuranceRateShantui.length==0){
                insuranceRateShantui=0;
            }
            if(insuranceYearCostShantui.length==0){
                insuranceYearCostShantui=0;
            }
            //保险成本/小时 = 每年成本/预计工作时间（小时/年）--当每年成本大于0时
            //保险成本/小时 = (预计拥有年限（年）+1)/(2*预计拥有年限（年）)*(交付价格（包括附件）-更换所有轮胎的价格)*保险率/预计工作时间（小时/年）

            if(years_shantui*hours_shantui==0){
                insuranceCostShantui = 0;
            }else if(insuranceYearCostShantui>0){
                insuranceCostShantui = (insuranceYearCostShantui/hours_shantui).toFixed(2);
            }else{
                insuranceCostShantui = ((parseFloat(years_shantui)+1)/(2*years_shantui)*(paymentPriceShantui-tireChangePriceShantui)*insuranceRateShantui/hours_shantui).toFixed(2);
            }
            $('#insuranceCostShantui').text(insuranceCostShantui);
            $('#bxcbSumShantui').text(insuranceCostShantui);
            var totalCost = (parseFloat(depreciationCostShantui)+parseFloat(rateCostShantui)+parseFloat(insuranceCostShantui)+parseFloat(assetRateCostShantui)).toFixed(2);
            $('#ownCostShantui').text(totalCost);//总拥有成本
            $('#totalOwnCostShantui').text(totalCost);//总拥有成本
        }

        var assetRateCostShantui = 0;//财产税成本
        //计算财产税成本
        window.ccscb_st = function (){
            //折旧金额=交付价格（包括附件）-更换所有轮胎的价格-以旧换新或转售价格
            var paymentPriceShantui = $('#paymentPriceShantui').val();//交付价格（包括附件）
            var tireChangePriceShantui = $('#tireChangePriceShantui').val();//更换所有轮胎的价格
            var resalePriceShantui = $('#resalePriceShantui').val();//以旧换新或转售价格
            var years_shantui = $('#years_shantui').val();//预计拥有年限（年）
            var hours_shantui = $('#hours_shantui').val();//预计工作时间（小时/年）
            var taxRateShantui = $('#taxRateShantui').val();//税率
            var assetYearCostShantui = $('#assetYearCostShantui').val();//每年成本
            if(paymentPriceShantui.length==0){
                paymentPriceShantui=0;
            }
            if(tireChangePriceShantui.length==0){
                tireChangePriceShantui=0;
            }
            if(resalePriceShantui.length==0){
                resalePriceShantui=0;
            }
            if(years_shantui.length==0){
                years_shantui=0;
            }
            if(hours_shantui.length==0){
                hours_shantui=0;
            }
            if(taxRateShantui.length==0){
                taxRateShantui=0;
            }
            if(assetYearCostShantui.length==0){
                assetYearCostShantui=0;
            }
            //财产税成本/小时 = 每年成本/预计工作时间（小时/年）--当每年成本大于0时
            //保险成本/小时 = (预计拥有年限（年）+1)/(2*预计拥有年限（年）)*(交付价格（包括附件）-更换所有轮胎的价格)*税率/预计工作时间（小时/年）

            if(years_shantui*hours_shantui==0){
                assetRateCostShantui = 0;
            }else if(assetYearCostShantui>0){
                assetRateCostShantui = (assetYearCostShantui/hours_shantui).toFixed(2);
            }else{
                assetRateCostShantui = ((parseFloat(years_shantui)+1)/(2*years_shantui)*(paymentPriceShantui-tireChangePriceShantui)*taxRateShantui/hours_shantui).toFixed(2);
            }
            $('#assetRateCostShantui').text(assetRateCostShantui);
            $('#ccscbSumShantui').text(assetRateCostShantui);//财产税成本汇总
            var totalCost = (parseFloat(depreciationCostShantui)+parseFloat(rateCostShantui)+parseFloat(insuranceCostShantui)+parseFloat(assetRateCostShantui)).toFixed(2);
            $('#ownCostShantui').text(totalCost);//总拥有成本
            $('#totalOwnCostShantui').text(totalCost);//总拥有成本
        }

        var depreciationCostOther = 0;//折旧成本
        //计算折旧成本
        window.zjcb_ot = function (){
            //折旧金额=交付价格（包括附件）-更换所有轮胎的价格-以旧换新或转售价格
            var paymentPriceOther = $('#paymentPriceOther').val();//交付价格（包括附件）
            var tireChangePriceOther = $('#tireChangePriceOther').val();//更换所有轮胎的价格
            var resalePriceOther = $('#resalePriceOther').val();//以旧换新或转售价格
            var years_other = $('#years_other').val();//预计拥有年限（年）
            var hours_other = $('#hours_other').val();//预计工作时间（小时/年）
            if(paymentPriceOther.length==0){
                paymentPriceOther=0;
            }
            if(tireChangePriceOther.length==0){
                tireChangePriceOther=0;
            }
            if(resalePriceOther.length==0){
                resalePriceOther=0;
            }
            if(years_other.length==0){
                years_other=0;
            }
            if(hours_other.length==0){
                hours_other=0;
            }
            var depreciationAmountOther = (paymentPriceOther-tireChangePriceOther-resalePriceOther).toFixed(2);
            $('#depreciationAmountOther').text(depreciationAmountOther);
            //折旧成本=折旧金额/（预计拥有年限（年）*预计工作时间（小时/年））
            if(years_other*hours_other==0){
                depreciationCostOther = 0;
            }else{
                depreciationCostOther = (depreciationAmountOther/(years_other*hours_other)).toFixed(2);
            }
            $('#depreciationCostOther').text(depreciationCostOther);
            $('#zjcbSumOther').text(depreciationCostOther);
            var totalCost = (parseFloat(depreciationCostOther)+parseFloat(rateCostOther)+parseFloat(insuranceCostOther)+parseFloat(assetRateCostOther)).toFixed(2);
            $('#ownCostOther').text(totalCost);//总拥有成本
            $('#totalOwnCostOther').text(totalCost);//总拥有成本
        }

        var rateCostOther = 0;//利息成本
        //计算利息成本
        window.lxcb_ot = function (){
            //折旧金额=交付价格（包括附件）-更换所有轮胎的价格-以旧换新或转售价格
            var paymentPriceOther = $('#paymentPriceOther').val();//交付价格（包括附件）
            var tireChangePriceOther = $('#tireChangePriceOther').val();//更换所有轮胎的价格
            var resalePriceOther = $('#resalePriceOther').val();//以旧换新或转售价格
            var years_other = $('#years_other').val();//预计拥有年限（年）
            var hours_other = $('#hours_other').val();//预计工作时间（小时/年）
            var financingPeriodOther = $('#financingPeriodOther').val();//预计融资期
            var rateOther = $('#rateOther').val();//利息率
            if(paymentPriceOther.length==0){
                paymentPriceOther=0;
            }
            if(tireChangePriceOther.length==0){
                tireChangePriceOther=0;
            }
            if(resalePriceOther.length==0){
                resalePriceOther=0;
            }
            if(years_other.length==0){
                years_other=0;
            }
            if(hours_other.length==0){
                hours_other=0;
            }
            if(financingPeriodOther.length==0){
                financingPeriodOther=0;
            }
            if(rateOther.length==0){
                rateOther=0;
            }
            //利息成本/小时 =（预计融资期+1）/（2*预计融资期）*（交付价格（包括附件）-更换所有轮胎的价格）*利息率/预计工作时间（小时/年）*(预计融资期/预计拥有年限（年）)

            if(years_other*hours_other==0){
                rateCostOther = 0;
            }else{
                if(financingPeriodOther == 0){
                    rateCostOther = 0;
                }else{
                    rateCostOther = ((parseFloat(financingPeriodOther)+1)/(2*financingPeriodOther)*(paymentPriceOther-tireChangePriceOther)*rateOther/hours_other*(financingPeriodOther/years_other)).toFixed(2);
                }
            }
            $('#rateCostOther').text(rateCostOther);
            $('#lxcbSumOther').text(rateCostOther);
            var totalCost = (parseFloat(depreciationCostOther)+parseFloat(rateCostOther)+parseFloat(insuranceCostOther)+parseFloat(assetRateCostOther)).toFixed(2);
            $('#ownCostOther').text(totalCost);//总拥有成本
            $('#totalOwnCostOther').text(totalCost);//总拥有成本
        }

        var insuranceCostOther = 0;//保险成本
        //计算保险成本
        window.bxcb_ot = function (){
            //折旧金额=交付价格（包括附件）-更换所有轮胎的价格-以旧换新或转售价格
            var paymentPriceOther = $('#paymentPriceOther').val();//交付价格（包括附件）
            var tireChangePriceOther = $('#tireChangePriceOther').val();//更换所有轮胎的价格
            var resalePriceOther = $('#resalePriceOther').val();//以旧换新或转售价格
            var years_other = $('#years_other').val();//预计拥有年限（年）
            var hours_other = $('#hours_other').val();//预计工作时间（小时/年）
            var insuranceRateOther = $('#insuranceRateOther').val();//保险率
            var insuranceYearCostOther = $('#insuranceYearCostOther').val();//每年成本
            if(paymentPriceOther.length==0){
                paymentPriceOther=0;
            }
            if(tireChangePriceOther.length==0){
                tireChangePriceOther=0;
            }
            if(resalePriceOther.length==0){
                resalePriceOther=0;
            }
            if(years_other.length==0){
                years_other=0;
            }
            if(hours_other.length==0){
                hours_other=0;
            }
            if(insuranceRateOther.length==0){
                insuranceRateOther=0;
            }
            if(insuranceYearCostOther.length==0){
                insuranceYearCostOther=0;
            }
            //保险成本/小时 = 每年成本/预计工作时间（小时/年）--当每年成本大于0时
            //保险成本/小时 = (预计拥有年限（年）+1)/(2*预计拥有年限（年）)*(交付价格（包括附件）-更换所有轮胎的价格)*保险率/预计工作时间（小时/年）

            if(years_other*hours_other==0){
                insuranceCostOther = 0;
            }else if(insuranceYearCostOther>0){
                insuranceCostOther = (insuranceYearCostOther/hours_other).toFixed(2);
            }else{
                insuranceCostOther = ((parseFloat(years_other)+1)/(2*years_other)*(paymentPriceOther-tireChangePriceOther)*insuranceRateOther/hours_other).toFixed(2);
            }
            $('#insuranceCostOther').text(insuranceCostOther);
            $('#bxcbSumOther').text(insuranceCostOther);
            var totalCost = (parseFloat(depreciationCostOther)+parseFloat(rateCostOther)+parseFloat(insuranceCostOther)+parseFloat(assetRateCostOther)).toFixed(2);
            $('#ownCostOther').text(totalCost);//总拥有成本
            $('#totalOwnCostOther').text(totalCost);//总拥有成本
        }

        var assetRateCostOther = 0;//财产税成本
        //计算财产税成本
        window.ccscb_ot = function (){
            //折旧金额=交付价格（包括附件）-更换所有轮胎的价格-以旧换新或转售价格
            var paymentPriceOther = $('#paymentPriceOther').val();//交付价格（包括附件）
            var tireChangePriceOther = $('#tireChangePriceOther').val();//更换所有轮胎的价格
            var resalePriceOther = $('#resalePriceOther').val();//以旧换新或转售价格
            var years_other = $('#years_other').val();//预计拥有年限（年）
            var hours_other = $('#hours_other').val();//预计工作时间（小时/年）
            var taxRateOther = $('#taxRateOther').val();//税率
            var assetYearCostOther = $('#assetYearCostOther').val();//每年成本
            if(paymentPriceOther.length==0){
                paymentPriceOther=0;
            }
            if(tireChangePriceOther.length==0){
                tireChangePriceOther=0;
            }
            if(resalePriceOther.length==0){
                resalePriceOther=0;
            }
            if(years_other.length==0){
                years_other=0;
            }
            if(hours_other.length==0){
                hours_other=0;
            }
            if(taxRateOther.length==0){
                taxRateOther=0;
            }
            if(assetYearCostOther.length==0){
                assetYearCostOther=0;
            }
            //财产税成本/小时 = 每年成本/预计工作时间（小时/年）--当每年成本大于0时
            //保险成本/小时 = (预计拥有年限（年）+1)/(2*预计拥有年限（年）)*(交付价格（包括附件）-更换所有轮胎的价格)*税率/预计工作时间（小时/年）

            if(years_other*hours_other==0){
                assetRateCostOther = 0;
            }else if(assetYearCostOther>0){
                assetRateCostOther = (assetYearCostOther/hours_other).toFixed(2);
            }else{
                assetRateCostOther = ((parseFloat(years_other)+1)/(2*years_other)*(paymentPriceOther-tireChangePriceOther)*taxRateOther/hours_other).toFixed(2);
            }
            $('#assetRateCostOther').text(assetRateCostOther);
            $('#ccscbSumOther').text(assetRateCostOther);//财产税成本汇总
            var totalCost = (parseFloat(depreciationCostOther)+parseFloat(rateCostOther)+parseFloat(insuranceCostOther)+parseFloat(assetRateCostOther)).toFixed(2);
            $('#ownCostOther').text(totalCost);//总拥有成本
            $('#totalOwnCostOther').text(totalCost);//总拥有成本
        }

    });

</script>
</body>
</html>