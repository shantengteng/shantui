package com.mysiteforme.admin.controller.shantui;

import com.google.common.collect.Maps;
import com.mysiteforme.admin.base.BaseController;
import com.mysiteforme.admin.entity.Device;
import com.mysiteforme.admin.entity.DeviceFuelConsumption;
import com.mysiteforme.admin.entity.DeviceGrease;
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
        DeviceGrease deviceGrease = deviceGreaseService.selectByDeviceId(deviceId);
        dataVo.setDeviceFuelConsumptions(deviceFuelConsumptions);
        dataVo.setDeviceGrease(deviceGrease);
        return RestResponse.success().setData(dataVo);
    }
}
