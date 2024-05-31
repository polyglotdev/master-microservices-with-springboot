package com.domhallan.accounts.exception;

import com.domhallan.accounts.dto.ErrorResponseDto;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;

import java.time.LocalDateTime;

@ControllerAdvice
public class GlobalExceptionHandler {

  /**
   * Handles the {@link CustomerAlreadyExistsException} and returns a ResponseEntity with an ErrorResponseDto.
   *
   * @param exception   The {@link CustomerAlreadyExistsException} being handled.
   * @param webRequest  The current web request.
   * @return A ResponseEntity containing an ErrorResponseDto with the error details.
   * @see CustomerAlreadyExistsException
   * @see ErrorResponseDto
   *
   * <h2>Example Usage:</h2>
   * <pre>
   *   {@code
   *   ResponseEntity<ErrorResponseDto> responseEntity = handleCustomerAlreadyExistsException(exception, webRequest); // Output: ResponseEntity<ErrorResponseDto>: ResponseEntity containing an ErrorResponseDto with the error details.
   *   }
   * </pre>
   *
   * @since 2024-05-31
   */
  @ExceptionHandler(CustomerAlreadyExistsException.class)
  public ResponseEntity<ErrorResponseDto> handleCustomerAlreadyExistsException(CustomerAlreadyExistsException exception, WebRequest webRequest) {

    ErrorResponseDto errorResponseDto = new ErrorResponseDto(
        webRequest.getDescription(false),
        HttpStatus.BAD_REQUEST,
        exception.getMessage(),
        LocalDateTime.now().toString()
    );
    return new ResponseEntity<>(errorResponseDto,
        HttpStatus.BAD_REQUEST);
  }
}
