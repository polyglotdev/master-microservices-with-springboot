package com.domhallan.accounts.mapper;

import com.domhallan.accounts.dto.AccountsDto;
import com.domhallan.accounts.entity.Accounts;

public class AccountsMapper {
  /**
   * Maps the data from an Accounts object to an existing AccountsDto object.
   *
   * @param accounts The Accounts object containing the data to be mapped
   * @param accountsDto The existing AccountsDto object to map the data to
   * @return The updated AccountsDto object with the mapped data
   */
  public static AccountsDto mapToAccountsDto(Accounts accounts, AccountsDto accountsDto) {
    accountsDto.setAccountNumber(accounts.getAccountNumber());
    accountsDto.setAccountType(accounts.getAccountType());
    accountsDto.setBranchAddress(accounts.getBranchAddress());
    return accountsDto;
  }

  /**
   * Maps the data from an AccountsDto object to an existing Accounts object.
   *
   * @param accountsDto The AccountsDto object containing the data to be mapped
   * @param accounts The existing Accounts object to map the data to
   * @return The updated Accounts object with the mapped data
   */
  public static Accounts mapToAccounts(AccountsDto accountsDto, Accounts accounts) {
    accounts.setAccountNumber(accountsDto.getAccountNumber());
    accounts.setAccountType(accountsDto.getAccountType());
    accounts.setBranchAddress(accountsDto.getBranchAddress());
    return accounts;
  }
}
