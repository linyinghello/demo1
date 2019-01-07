package com.example.demo1.mapper;


import com.example.demo1.pojo.UserInfo;

import java.util.List;

public interface UserInfoMapper {

    List<UserInfo> selectUserList();
}
