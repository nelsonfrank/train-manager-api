package com.elasticteam.demo.error;

import com.elasticteam.demo.dto.GenericResponse;

import java.util.ArrayList;
import java.util.List;
import javax.servlet.http.HttpServletRequest;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

/**
 * The type Demo exception handler.
 */
@ControllerAdvice
public class DemoExceptionHandler extends ResponseEntityExceptionHandler {

    /**
     * Custom handle not found response entity.
     *
     * @param ex      the ex
     * @param request the request
     * @return the response entity
     */
    @ExceptionHandler(EntityNotFoundException.class)
    public ResponseEntity<GenericResponse> customHandleNotFound(Exception ex,
            WebRequest request) {
        return new ResponseEntity<>(new GenericResponse(ex.getMessage(), null),
                HttpStatus.NOT_FOUND);
    }

    /**
     * Custom handle Bad request response entity.
     *
     * @param ex      the ex
     * @param request the request
     * @return the response entity
     */
    @ExceptionHandler(BadRequestException.class)
    public ResponseEntity<GenericResponse> customHandleBadRequest(Exception ex,
            WebRequest request) {
        return new ResponseEntity<>(new GenericResponse(ex.getMessage(), null),
                HttpStatus.BAD_REQUEST);
    }

    /**
     * Custom handle Method not allowed response entity.
     *
     * @param ex      the ex
     * @param request the request
     * @return the response entity
     */
    @ExceptionHandler(MethodNotAllowedException.class)
    public ResponseEntity<GenericResponse> customHandleMethodNotAllowed(Exception ex,
            WebRequest request) {
        return new ResponseEntity<>(new GenericResponse(ex.getMessage(), null),
                HttpStatus.METHOD_NOT_ALLOWED);
    }

    @ExceptionHandler({ Exception.class })
    public ResponseEntity<Object> genericException(
            Exception ex,
            HttpServletRequest request) {
        return new ResponseEntity<>(
                new GenericResponse("Invalid endpoint", null),
                HttpStatus.METHOD_NOT_ALLOWED);
    }

    @Override
    protected ResponseEntity<Object> handleMethodArgumentNotValid(MethodArgumentNotValidException ex,
            HttpHeaders headers, HttpStatus status, WebRequest request) {
        List<String> details = new ArrayList<>();
        for (ObjectError error : ex.getBindingResult().getAllErrors()) {
            details.add(error.getDefaultMessage());
        }
        return new ResponseEntity<>(new GenericResponse(
                "Bad Request", null),
                HttpStatus.BAD_REQUEST);
    }
}
