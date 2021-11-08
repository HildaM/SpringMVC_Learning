package com.quan.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.quan.pojo.User;
import lombok.SneakyThrows;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName: UserController
 * @Description:
 * @author: Hilda   Hilda_quan@163.com
 * @date: 2021/11/8 16:38
 */

@RestController
// @Controller
public class UserController {

    @SneakyThrows
    @RequestMapping("/j1")
    @ResponseBody    // 它就不会走视图解析器，会直接返回一个字符串！！！
    public String json01() {
        // 创对象
        User user = new User("测试", 13, "女");

        // jackson, ObjectMapper
        ObjectMapper mappper = new ObjectMapper();
        String str = mappper.writeValueAsString(user);

        return str;
    }

    @RequestMapping("/j2")
    public String json02() throws JsonProcessingException {
        //创建 jackson 的对象映射器以解析数据
        ObjectMapper mapper = new ObjectMapper();
        // 创建好多对象
        User user1 = new User("祈鸢A", 18, "男");
        User user2 = new User("祈鸢B", 18, "男");
        User user3 = new User("祈鸢C", 18, "男");
        User user4 = new User("祈鸢D", 18, "男");
        List<User> list = new ArrayList<User>();
        list.add(user1);
        list.add(user2);
        list.add(user3);
        list.add(user4);

        // 将对象解析成为 JSON 字符串
        String str = mapper.writeValueAsString(list);
        return str;
    }


    @RequestMapping("/j4")
    public String json04() {
        User user1 = new User("权1", 1, "man");
        User user2 = new User("权2", 2, "man");
        User user3 = new User("权3", 3, "man");
        User user4 = new User("权4", 4, "man");
        User user5 = new User("权5", 5, "man");

        List<User> list = new ArrayList<User>();
        list.add(user1);
        list.add(user2);
        list.add(user3);
        list.add(user4);
        list.add(user5);

        System.out.println("*******Java对象 转 JSON字符串*******");
        String str1 = JSON.toJSONString(list);
        System.out.println("JSON.toJSONString(list)==>"+str1);

        String str2 = JSON.toJSONString(user1);
        System.out.println("JSON.toJSONString(user1)==>"+str2);

        System.out.println("\n****** JSON字符串 转 Java对象*******");
        User jp_user1 = JSON.parseObject(str2,User.class);
        System.out.println("JSON.parseObject(str2,User.class)==>"+jp_user1);

        System.out.println("\n****** Java对象 转 JSON对象 ******");
        JSONObject jsonObject1 = (JSONObject) JSON.toJSON(user2);
        System.out.println("(JSONObject) JSON.toJSON(user2)==>"+jsonObject1.getString("name"));

        System.out.println("\n****** JSON对象 转 Java对象 ******");
        User to_java_user = JSON.toJavaObject(jsonObject1, User.class);
        System.out.println("JSON.toJavaObject(jsonObject1, User.class)==>"+to_java_user);


        return "hello";
    }

}
