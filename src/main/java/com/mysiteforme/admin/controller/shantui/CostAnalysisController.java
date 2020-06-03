package com.mysiteforme.admin.controller.shantui;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/shantui/costAnalysis")
public class CostAnalysisController {

    private static final Logger LOGGER = LoggerFactory.getLogger(CostAnalysisController.class);

    @GetMapping("list")
    public String list(){
        return "admin/costAnalysis/list";
    }
}
