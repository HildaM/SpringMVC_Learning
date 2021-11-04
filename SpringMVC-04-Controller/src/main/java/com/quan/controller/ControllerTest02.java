package com.quan.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
/**
 * @ClassName: ControllerTest02
 * @Description:
 * @author: Hilda   Hilda_quan@163.com
 * @date: 2021/11/4 14:35
 */

@Controller
public class ControllerTest02 {

    @RequestMapping("/hello1")
    public String test02(Model model) {
        model.addAttribute("msg", "ControllerTest02");
        return "hello";
    }
}
