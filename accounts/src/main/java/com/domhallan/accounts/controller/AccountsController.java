package com.domhallan.accounts.controller;

import com.domhallan.accounts.dto.CustomerDto;
import com.domhallan.accounts.dto.ResponseDto;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path="/api", produces = "application/json")
public class AccountsController {

  @PostMapping("/create")
  public ResponseEntity<ResponseDto> createAccount(@RequestBody CustomerDto customerDto) {
    return ResponseEntity
        .status(HttpStatus.CREATED)
        .body(new ResponseDto("201", "Account created successfully"));
  }
}
