package com.quan.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @ClassName: HelloController
 * @Description:
 * @author: Hilda   Hilda_quan@163.com
 * @date: 2021/11/3 21:13
 */

// 等价于 <bean id="/hello" class="nuc.ss.controller.HelloController"/>
@Controller
public class HelloController {

    // 转发请求的注解：访问地址 localhost:8080/项目路径/hello
    @RequestMapping("/hello")
    public String hello(Model model) {
        // 封装数据
        // 处理业务，结果放在 model 中！
        // 不过没返回，前面是怎么获取的呢？
        model.addAttribute("msg", "Hello, SpringMVC_Annotation");

        return "hello";   // 会被视图解析器处理
    }
}
