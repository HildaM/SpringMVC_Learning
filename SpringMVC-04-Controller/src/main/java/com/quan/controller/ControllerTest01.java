package com.quan.controller;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @ClassName: ControllerTest01
 * @Description:
 * @author: Hilda   Hilda_quan@163.com
 * @date: 2021/11/4 14:25
 */
public class ControllerTest01 implements Controller {

    public ModelAndView handleRequest(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws Exception {
        //返回一个模型视图对象
        ModelAndView mv = new ModelAndView();
        mv.addObject("msg","Test1Controller");
        mv.setViewName("hello");
        return mv;
    }
}
