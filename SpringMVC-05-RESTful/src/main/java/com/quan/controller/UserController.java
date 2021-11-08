package com.quan.controller;

import com.quan.pojo.User;
import com.sun.org.glassfish.gmbal.ParameterNames;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @ClassName: UserController
 * @Description:
 * @author: Hilda   Hilda_quan@163.com
 * @date: 2021/11/8 15:21
 */

@Controller
@RequestMapping("/user")
public class UserController {

    // localhost:8081/user/t1?name=xxx
    @GetMapping("/t1")
    public String test01(@RequestParam("username") String name, Model model) {
        // 1. 接受前端参数
        System.out.println("接收的前端参数为：" + name);

        // 2. 将返回的结构传递给前端
        model.addAttribute("msg", name);

        // 3. 跳转视图
        return "hello";
    }

    // 前端接受一个对象
    @GetMapping("/t2")
    public String test02(@RequestParam("user") User user, Model model) {
        System.out.println("接受的前端参数为：" + user);
        model.addAttribute("msg", user.getName());
        return "hello";
    }


    @GetMapping("/t3")
    public String test03(ModelMap modelMap) {


        return "hello";
    }
}
