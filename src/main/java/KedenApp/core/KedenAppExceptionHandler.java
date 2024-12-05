package KedenApp.core;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class KedenAppExceptionHandler {

    @ExceptionHandler(KedenAppException.class)
    public String handleException(KedenAppException ex) {
        return ex.getMessage();
    }
}
