package edu.cnm.deepdive.quotes.controller;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class ControllerExceptionHandler {

  @ExceptionHandler(NoSuchFieldException.class)
  @ResponseStatus(value = HttpStatus.NOT_FOUND,reason = "resource not found")
  public void notFound() {}

}
