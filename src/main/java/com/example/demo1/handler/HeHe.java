package com.example.demo1.handler;

import com.example.demo1.pojo.UserInfo;
import com.example.demo1.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class HeHe {

@Autowired
private UserService userService;
    @RequestMapping("index")
    @ResponseBody
    public String getindex(){
        return "index";
    }

    @RequestMapping("userList")
    @ResponseBody
    public List<UserInfo> getUserList(){
        System.out.println("111");
        return userService.getUserList();
    }

}
