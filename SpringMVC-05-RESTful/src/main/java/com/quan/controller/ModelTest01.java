package com.quan.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * @ClassName: ModelTest01
 * @Description:
 * @author: Hilda   Hilda_quan@163.com
 * @date: 2021/11/4 16:24
 */

@Controller
public class ModelTest01 {
    @RequestMapping("/hello")
    public String test(HttpServletRequest request, HttpServletResponse response) {
        HttpSession session = request.getSession();
        System.out.println(session.getId());

        return "redirect:/index.jsp";
    }
}
