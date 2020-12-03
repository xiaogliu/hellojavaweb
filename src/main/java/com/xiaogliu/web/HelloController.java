package com.xiaogliu.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {

    @GetMapping("/")
    @ResponseBody
    public  String Home() {
        return "Hello Java Web!!!";
    }

    @GetMapping("/page2")
    @ResponseBody
    public  String Page2() {
        return "这是第二个 page";
    }

}
