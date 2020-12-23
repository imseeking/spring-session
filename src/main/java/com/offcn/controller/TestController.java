package com.offcn.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;

@RestController
public class TestController {


    @GetMapping("set")
    public String setSession(HttpSession session){
        session.setAttribute("msg","Hello Spring Session");
        return "ok";
    }

    @GetMapping("get")
    public String getSession(HttpSession session){
        String msg = (String) session.getAttribute("msg");
        return msg;
    }


    public void testBranch(){
        System.out.println("用来测试分支合并的方法");
    }

}
