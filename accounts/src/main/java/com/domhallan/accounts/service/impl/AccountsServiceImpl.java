package com.domhallan.accounts.service.impl;

import com.domhallan.accounts.dto.CustomerDto;
import com.domhallan.accounts.repository.AccountsRepository;
import com.domhallan.accounts.repository.CustomerRepository;
import com.domhallan.accounts.service.IAccountsService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class AccountsServiceImpl implements IAccountsService {

  private AccountsRepository accountsRepository;
  private CustomerRepository customerRepository;

  /**
   * @param customerDto The customer information for creating the account.
   */
  @Override
  public void createAccount(CustomerDto customerDto) {

  }
}
