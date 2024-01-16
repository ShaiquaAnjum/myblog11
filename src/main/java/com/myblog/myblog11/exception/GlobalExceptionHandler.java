package com.myblog.myblog11.exception;

import com.myblog.myblog11.payload.ErrorMessage;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import java.util.Date;

@ControllerAdvice
public class GlobalExceptionHandler extends ResponseEntityExceptionHandler {

    @ExceptionHandler(ResourceNotFound.class)
    public ResponseEntity<ErrorMessage> exceptionhandler (ResourceNotFound e, WebRequest webrequest){
        ErrorMessage errorMessage=new ErrorMessage(e.getMessage(),new Date(),webrequest.getDescription(true));
        return new ResponseEntity<>(errorMessage,HttpStatus.INTERNAL_SERVER_ERROR);

    }

}
