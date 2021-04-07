package com.william.marvelspring.config;

import com.william.marvelspring.exceptions.ResourceNotFoundException;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice
public class RestResponseEntityExceptionHandler extends ResponseEntityExceptionHandler {

    @Data
    @AllArgsConstructor
    @NoArgsConstructor
    private class JsonResponse {
        String message;
    }

    @ExceptionHandler(value = ResourceNotFoundException.class)
    public ResponseEntity<JsonResponse> handleException(Exception e) {
        String bodyOfResponse = "We couldn't find that resource";
        return new ResponseEntity<JsonResponse>(new JsonResponse(bodyOfResponse), HttpStatus.BAD_REQUEST);
    }
}
