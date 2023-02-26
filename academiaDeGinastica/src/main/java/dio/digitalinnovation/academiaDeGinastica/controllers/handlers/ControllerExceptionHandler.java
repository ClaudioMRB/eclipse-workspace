package dio.digitalinnovation.academiaDeGinastica.controllers.handlers;

import java.time.Instant;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import dio.digitalinnovation.academiaDeGinastica.dto.CustomError;
import dio.digitalinnovation.academiaDeGinastica.exception.DatabaseException;
import dio.digitalinnovation.academiaDeGinastica.exception.ResourceNotFoundException;
import jakarta.servlet.http.HttpServletRequest;


@ControllerAdvice
public class ControllerExceptionHandler {
    //Tratando erros de forma personalizada
    @ExceptionHandler(ResourceNotFoundException.class)
    public ResponseEntity<CustomError> resourceNotFound(ResourceNotFoundException e, HttpServletRequest request) {
        HttpStatus status = HttpStatus.NOT_FOUND;
        CustomError error = new CustomError(Instant.now(), status.value(), e.getMessage(), request.getRequestURI());
        return ResponseEntity.status(status).body(error);
    }

    @ExceptionHandler(DatabaseException.class)
    public ResponseEntity<CustomError> database(DatabaseException e, HttpServletRequest request) {
        HttpStatus status = HttpStatus.BAD_REQUEST;
        CustomError error = new CustomError(Instant.now(), status.value(), e.getMessage(), request.getRequestURI());
        return ResponseEntity.status(status).body(error);
    }
}