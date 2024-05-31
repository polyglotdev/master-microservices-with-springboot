package com.domhallan.accounts.constants;

public final class AccountsConstants {

  private AccountsConstants() {
    // restrict instantiation
  }

  public static final String  SAVINGS = "Savings";
  public static final String  ADDRESS = "123 Main Street, New York";
  public static final String  STATUS_201 = "201";
  public static final String  MESSAGE_201 = "Account created successfully";
  public static final String  STATUS_200 = "200";
  public static final String  MESSAGE_200 = "Request processed successfully";
  public static final String  STATUS_417 = "417";
  public static final String  MESSAGE_417_UPDATE= "Update operation failed. Please try again or contact Dev team";
  public static final String  MESSAGE_417_DELETE= "Delete operation failed. Please try again or contact Dev team";
  public static final String CUSTOMER_EXISTS = "Customer already exists";
  public static final String CUSTOMER_MOBILE_NUMBER_ALREADY_EXISTS =
      "Mobile number already exists in the database";
}
