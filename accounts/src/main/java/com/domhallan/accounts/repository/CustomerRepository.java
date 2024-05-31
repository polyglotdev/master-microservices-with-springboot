package com.domhallan.accounts.repository;


import com.domhallan.accounts.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Long> {

  /**
   * Finds a customer by their mobile number.
   *
   * @param mobileNumber The mobile number of the customer to find.
   * @return An optional containing the customer with the specified mobile number, or empty if no customer is found.
   */
  Optional<Customer> findByMobileNumber(String mobileNumber);
}
