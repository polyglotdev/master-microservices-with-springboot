package com.domhallan.accounts.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.http.HttpStatus;

@Data @AllArgsConstructor
public class ErrorResponseDto {
  // Represents the API path where the error occurred
  private String apiPath;

  // Represents the error code as an HTTP status
  private HttpStatus errorCode;

  // Represents the error message
  private String errorMessage;

  // Represents the error details
  private String errorDetails;
}
