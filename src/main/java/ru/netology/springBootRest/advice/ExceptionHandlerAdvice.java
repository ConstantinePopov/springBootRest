package ru.netology.springBootRest.advice;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import ru.netology.springBootRest.exception.InvalidCredentials;
import ru.netology.springBootRest.exception.UnauthorizedUser;

@RestControllerAdvice
public class ExceptionHandlerAdvice {
    @ExceptionHandler(InvalidCredentials.class)
    public ResponseEntity<String> icHandler(InvalidCredentials e) {
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("InvalidCredentials: " + e.getMessage());
    }

    @ExceptionHandler(UnauthorizedUser.class)
    public ResponseEntity<String> uuHandler(UnauthorizedUser e) {
        return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body("UnauthorizedUser: " + e.getMessage());
    }
}
