package com.domhallan.accounts.controller;

import com.domhallan.accounts.constants.AccountsConstants;
import com.domhallan.accounts.dto.CustomerDto;
import com.domhallan.accounts.dto.ResponseDto;
import com.domhallan.accounts.service.IAccountsService;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path="/api", produces = {MediaType.APPLICATION_JSON_VALUE})
public class AccountsController {

  private IAccountsService iAccountsService;


  /**
   * Creates a new account with the given customer information.
   *
   * @param customerDto the customer information to create the account
   * @return the response entity containing the status code and status message
   */
  @PostMapping("/create")
  public ResponseEntity<ResponseDto> createAccount(@RequestBody CustomerDto customerDto) {
    return ResponseEntity
        .status(HttpStatus.CREATED)
        .body(new ResponseDto(AccountsConstants.STATUS_201,
            AccountsConstants.MESSAGE_201));
  }
}
