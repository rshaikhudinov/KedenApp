package KedenApp.core;

import lombok.Getter;
import org.springframework.http.HttpStatus;

@Getter
public class KedenAppException extends RuntimeException {

    public KedenAppException(String message) {
        super(message);
    }

    public KedenAppException(String message, Throwable throwable) {
        super(message, throwable);
    }

    public HttpStatus getStatus() {
        return HttpStatus.INTERNAL_SERVER_ERROR;
    }
}
