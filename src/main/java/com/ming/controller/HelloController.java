package com.ming.controller;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @Description
 * @auther Ming
 * @create 2022-09-20 11:45
 */
@Controller
@Scope
public class HelloController {

    @RequestMapping("/helloworld")
    public String hellworld() {
        System.out.println("helloworld");
        return "success";//结果如何跳转呢？需要配置映射解析器
    }

}
