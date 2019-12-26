package com.example.mapper;

import com.example.pojo.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface UserMapper {
  public  void add(User user);
  public List<User> listUser1();
  public void update (User user);

}
