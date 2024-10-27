package dio.spring_api.controller.exception;

import dio.spring_api.domain.model.User;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(IllegalArgumentException.class)
    public ResponseEntity<String> handle(IllegalArgumentException businnsException){
        return  new ResponseEntity<>(businnsException.getMessage(), HttpStatus.UNPROCESSABLE_ENTITY);
    }
}

