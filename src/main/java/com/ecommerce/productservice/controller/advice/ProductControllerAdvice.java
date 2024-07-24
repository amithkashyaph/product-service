package com.ecommerce.productservice.controller.advice;

import com.ecommerce.productservice.dtos.ExceptionDto;
import com.ecommerce.productservice.exception.ProductNotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;

@ControllerAdvice
public class ProductControllerAdvice {

    @ExceptionHandler(ProductNotFoundException.class)
    @ResponseStatus(HttpStatus.NOT_FOUND)
    public ExceptionDto handleProductNotFoundException(ProductNotFoundException e) {
        ExceptionDto exceptionDto = new ExceptionDto();
        exceptionDto.setMesaage(e.getMessage());
        exceptionDto.setStatus("Failure");

        return exceptionDto;
    }
}
