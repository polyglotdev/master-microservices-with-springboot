package com.domhallan.accounts.service;

import com.domhallan.accounts.dto.CustomerDto;

public interface IAccountsService {


  /**
   * Creates an account for the given customer.
   *
   * @param customerDto The customer information for creating the account.
   */
  void createAccount(CustomerDto customerDto);
}
