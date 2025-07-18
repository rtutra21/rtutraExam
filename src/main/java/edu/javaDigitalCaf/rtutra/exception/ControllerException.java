package edu.javaDigitalCaf.rtutra.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.util.LinkedHashMap;
import java.util.Map;

@ControllerAdvice
public class ControllerException {
    @ExceptionHandler(value = {RuntimeException.class})
    public ResponseEntity<Object> handleRuntimeException(RuntimeException ex) {

        Map<String, Object> body = new LinkedHashMap<>();
        int errorCode = ex.getMessage().equalsIgnoreCase("User not found") ? 404 : 500;
        body.put("code", errorCode);
        body.put("message", ex.getMessage());

        return new ResponseEntity<>(body, errorCode == 404 ? HttpStatus.NOT_FOUND : HttpStatus.INTERNAL_SERVER_ERROR);
    }
}
