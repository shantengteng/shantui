package com.mysiteforme.admin.controller.shantui;

import com.google.common.collect.Maps;
import com.mysiteforme.admin.base.BaseController;
import com.mysiteforme.admin.entity.*;
import com.mysiteforme.admin.entity.VO.DeviceDataVo;
import com.mysiteforme.admin.util.RestResponse;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.servlet.ServletRequest;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/shantui/costAnalysis")
public class CostAnalysisController extends BaseController {

    private static final Logger LOGGER = LoggerFactory.getLogger(CostAnalysisController.class);

    @GetMapping("list")
    public String list(){
        return "admin/costAnalysis/list";
    }

    @GetMapping("add")
    public String add(Model model){
        Map<String,Object> map = Maps.newHashMap();
        map.put("device_belong",0);
        List<Device> deviceListShantui = deviceService.selectAllDevices(map);
        model.addAttribute("deviceListShantui",deviceListShantui);
        map.put("device_belong",1);
        List<Device> deviceListOther = deviceService.selectAllDevices(map);
        model.addAttribute("deviceListOther",deviceListOther);
        return "admin/costAnalysis/add";
    }

    @PostMapping ("getDeviceData")
    @ResponseBody
    public RestResponse getDeviceData(@RequestParam(value = "deviceId")Long deviceId,
                                ServletRequest request){
        List<DeviceFuelConsumption> deviceFuelConsumptions = deviceFuelConsumptionService.selectByExample(deviceId);
        DeviceDataVo dataVo = new DeviceDataVo();
        DeviceGrease deviceGrease = deviceGreaseService.selectByDeviceId(deviceId);//润滑油
        DeviceFilter deviceFilter = deviceFilterService.selectByDeviceId(deviceId);//滤芯
        DeviceChassis deviceChassis = deviceChassisService.selectByDeviceId(deviceId);//地盘
        DeviceBlade deviceBlade = deviceBladeService.selectByDeviceId(deviceId);//铲刀
        DeviceTrack deviceTrack = deviceTrackService.selectByDeviceId(deviceId);//履带
        DeviceRepair deviceRepair = deviceRepairService.selectByDeviceId(deviceId);//维修
        dataVo.setDeviceFuelConsumptions(deviceFuelConsumptions);
        dataVo.setDeviceGrease(deviceGrease);
        dataVo.setDeviceFilter(deviceFilter);
        dataVo.setDeviceChassis(deviceChassis);
        dataVo.setDeviceBlade(deviceBlade);
        dataVo.setDeviceTrack(deviceTrack);
        dataVo.setDeviceRepair(deviceRepair);
        return RestResponse.success().setData(dataVo);
    }
}
