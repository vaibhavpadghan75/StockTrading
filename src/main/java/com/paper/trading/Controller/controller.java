package com.paper.trading.Controller;

import com.paper.trading.Service.UserService;
import org.springframework.web.bind.annotation.RestController;

import com.paper.trading.DTO.UserDto;
import com.paper.trading.Entity.UserEntity;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;


@RestController 
public class controller {
  UserService userService;
  public controller(UserService userService)
  {
      this.userService=userService;
  }
  @PostMapping("/signup")
  public UserDto signup(@RequestBody UserDto user)
  {
    userService.RegisterUser(user);
    return user;
  }
  @GetMapping("/users")
  public List<UserDto> getAllUsers() {
      return userService.getAllUsers();
  }
  
  @GetMapping("/")
  public String getMethodName() {
      return new String("Hello world");
  }
  
}
