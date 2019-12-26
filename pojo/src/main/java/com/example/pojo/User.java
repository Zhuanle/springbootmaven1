package com.example.pojo;

public class User {
  private int id;
  private String name;
  private String username;
  private String password;
  private String desci;


  public String getDesci() {
    return desci;
  }

  public void setDesci(String desci) {
    this.desci = desci;
  }

  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    this.username = username;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }
}
