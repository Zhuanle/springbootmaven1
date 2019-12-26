package com.example.controller;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@MapperScan("com.example.mapper")
//@ComponentScan("com.example")
@SpringBootApplication public class ControllerApplication {

  public static void main(String[] args) {
    SpringApplication.run(ControllerApplication.class, args);
  }

}
