package com.domhallan.accounts.mapper;

import com.domhallan.accounts.dto.CustomerDto;
import com.domhallan.accounts.entity.Customer;

public class CustomerMapper {

  /**
   * Maps the fields from a {@link Customer} object to a {@link CustomerDto} object.
   * The fields that will be mapped are name, email, and mobileNumber.
   *
   * @param customer     The Customer object to map from.
   * @param customerDto  The CustomerDto object to map to.
   * @return The CustomerDto object with the mapped fields.
   */
  public static CustomerDto mapToCustomerDto(Customer customer, CustomerDto customerDto) {
    customerDto.setName(customer.getName());
    customerDto.setEmail(customer.getEmail());
    customerDto.setMobileNumber(customer.getMobileNumber());
    return customerDto;
  }

  /**
   * Maps the fields from a {@link CustomerDto} object to a {@link Customer} object.
   * The fields that will be mapped are name, email, and mobileNumber.
   *
   * @param customerDto The CustomerDto object to map from.
   * @param customer    The Customer object to map to.
   * @return The Customer object with the mapped fields.
   */
  public static Customer mapToCustomer(CustomerDto customerDto, Customer customer) {
    customer.setName(customerDto.getName());
    customer.setEmail(customerDto.getEmail());
    customer.setMobileNumber(customerDto.getMobileNumber());
    return customer;
  }
}
