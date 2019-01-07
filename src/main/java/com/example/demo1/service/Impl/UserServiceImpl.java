package com.example.demo1.service.Impl;

import com.example.demo1.mapper.UserInfoMapper;
import com.example.demo1.pojo.UserInfo;
import com.example.demo1.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserInfoMapper userInfoMapper;

    @Override
    public List<UserInfo> getUserList() {
        return userInfoMapper.selectAll();
    }
}
