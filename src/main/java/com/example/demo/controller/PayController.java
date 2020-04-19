package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

@Controller
public class PayController {

    @RequestMapping(path = "/page1")
    public String payIndex() {
        System.out.println("in method payIndex");
        return "payIndex";
    }

    @RequestMapping(path = "/page2")
    public String vueIndex() {
        System.out.println("in method vueIndex");
        return "redirect:/#/payIndex";
    }

    @RequestMapping(path = "/page4")
    public String record() {
        System.out.println("in method record");
        return "redirect:/#/record";
    }

    @RequestMapping(path = "/page3")
    public String carIn() {
        System.out.println("in method carIn");
        return "redirect:/#/carIn";
    }
}
