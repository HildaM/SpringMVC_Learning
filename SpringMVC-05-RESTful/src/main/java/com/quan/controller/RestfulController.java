package com.quan.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @ClassName: RestfulController
 * @Description:
 * @author: Hilda   Hilda_quan@163.com
 * @date: 2021/11/4 15:12
 */
@Controller
public class RestfulController {

    // 原来：localhost:8081/hello?a=1&b=2
    // RESTful: localhost:8081/hello/a/b
//    @RequestMapping(value = "/hello/{a}/{b}", method = RequestMethod.GET)
    @GetMapping("/hello/{a}/{b}")
    public String hello(@PathVariable int a, @PathVariable int b, Model model) {
        int res = a + b;
        model.addAttribute("msg", "结果为：" + res);

        return "hello";
    }
}
