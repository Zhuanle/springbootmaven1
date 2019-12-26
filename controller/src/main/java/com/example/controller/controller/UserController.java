package com.example.controller.controller;

import com.example.pojo.User;
import com.example.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {

  @Autowired UserService userService;

  @RequestMapping(value = "/list",method = RequestMethod.GET)
  public List<User> list(){
    return userService.listUser();
  }

  @RequestMapping(value = "/add",method = RequestMethod.POST)
  public  void add(@RequestBody User user ){
    userService.add(user);
  }

  @RequestMapping(value = "update",method = RequestMethod.POST)
  public void update(@RequestBody User user){
    userService.update(user);
  }
}
