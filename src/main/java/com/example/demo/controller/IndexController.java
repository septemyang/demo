package com.example.demo.controller;

import com.example.demo.dao.Project;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;

@Controller
public class IndexController {
    @Resource
    Project project=new Project();
    @RequestMapping("/")
    public String index(Model model){
        String a="thank you";
        String b=project.getName();
        model.addAttribute("msg",b);
       return "index";


    }
}
