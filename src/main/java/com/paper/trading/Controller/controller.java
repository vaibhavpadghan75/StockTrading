package com.paper.trading.Controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@RestController 
public class controller {
  

  @GetMapping("/")
  public String getMethodName() {
      return new String("Hello world");
  }
  
}
