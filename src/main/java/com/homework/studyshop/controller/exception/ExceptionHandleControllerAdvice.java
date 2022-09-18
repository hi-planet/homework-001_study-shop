package com.homework.studyshop.controller.exception;

import com.homework.studyshop.controller.response.Response;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@Slf4j
@RestControllerAdvice
public class ExceptionHandleControllerAdvice {

    @ExceptionHandler(Exception.class)
    protected ResponseEntity<Response<?>> handleException(Exception e) {
        log.error(e.getMessage(), e);
        return new ResponseEntity<>(Response.errorWith(e.getMessage()), HttpStatus.INTERNAL_SERVER_ERROR);
    }
}
