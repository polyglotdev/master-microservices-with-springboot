package com.domhallan.accounts.service.impl;

import com.domhallan.accounts.constants.AccountsConstants;
import com.domhallan.accounts.dto.CustomerDto;
import com.domhallan.accounts.entity.Accounts;
import com.domhallan.accounts.entity.Customer;
import com.domhallan.accounts.exception.CustomerAlreadyExistsException;
import com.domhallan.accounts.mapper.CustomerMapper;
import com.domhallan.accounts.repository.AccountsRepository;
import com.domhallan.accounts.repository.CustomerRepository;
import com.domhallan.accounts.service.IAccountsService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.Optional;
import java.util.Random;

@Service
@AllArgsConstructor
public class AccountsServiceImpl implements IAccountsService {

  private AccountsRepository accountsRepository;
  private CustomerRepository customerRepository;

  /**
   * Creates an account for the given customer.
   *
   * @param customerDto The {@link CustomerDto} object containing the customer information for creating the account.
   */
  @Override
  public void createAccount(CustomerDto customerDto) {
    Customer customer = CustomerMapper.mapToCustomer(customerDto, new Customer());
    /*
      Check if the customer already exists in the database.
      If the customer exists, then update the customer details.
      If the customer does not exist, then save the customer details.
     */
    Optional<Customer> optionalCustomer =
        customerRepository.findByMobileNumber(customerDto.getMobileNumber());
    if (optionalCustomer.isPresent()) {
      throw new CustomerAlreadyExistsException(AccountsConstants.CUSTOMER_MOBILE_NUMBER_ALREADY_EXISTS + " " + customerDto.getMobileNumber());
    }
    customer.setCreatedAt(LocalDateTime.now());
    customer.setCreatedBy("System");
    Customer savedCustomer = customerRepository.save(customer);
    accountsRepository.save(createNewAccount(savedCustomer));
  }

  /**
   * @param customer - Customer Object
   * @return the new account details
   */
  private Accounts createNewAccount(Customer customer) {
    Accounts newAccount = new Accounts();
    newAccount.setCustomerId(customer.getCustomerId());
    long randomAccNumber = 1000000000L + new Random().nextInt(900000000);

    newAccount.setAccountNumber(randomAccNumber);
    newAccount.setAccountType(AccountsConstants.SAVINGS);
    newAccount.setBranchAddress(AccountsConstants.ADDRESS);
    newAccount.setCreatedAt(LocalDateTime.now());
    newAccount.setCreatedBy("System");
    return newAccount;
  }
}
