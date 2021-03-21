package com.proximity.app.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;


public class ControllerExceptionHandler {

    @ExceptionHandler(value = UploadNotSupportedException.class)
    public ResponseEntity uploadNotSupportedException(UploadNotSupportedException e) {
        return  ResponseEntity.status(HttpStatus.NOT_IMPLEMENTED).body(e.getMessage());
    }

}
