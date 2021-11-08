package com.quan.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;

/**
 * @ClassName: EncodingController
 * @Description:
 * @author: Hilda   Hilda_quan@163.com
 * @date: 2021/11/8 15:44
 */

@Controller
public class EncodingController {

    @PostMapping("/e/t1")
    public String test01(String name, Model model) {
        model.addAttribute("msg", name);
        return "hello";
    }
}
