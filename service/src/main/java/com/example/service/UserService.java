package com.example.service;

import com.example.mapper.UserMapper;
import com.example.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;

@Service
public class UserService {
  @Autowired UserMapper userMapper;

  //获得用户列表
  public List<User> listUser(){
    List<User> list = userMapper.listUser1();
    for(User user:list){
      user.setPassword(null);
    }
    return list;
  }

  //用户注册
  public void add(User user){
    userMapper.add(user);
  }

  public void update(User user){
    userMapper.update(user);
  }
}
