package com.domhallan.accounts.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AccountsController {

  @GetMapping("/hello")
  public String Hello() {
    return "Hello";
  }

  @GetMapping("/world")
  public String World() {
    // Return json object
    return "{\"message\": \"World\"}";
  }

  @GetMapping("/accounts")
  public String Accounts() {
    // return html
    return "<h1>Accounts</h1>";
  }
}
