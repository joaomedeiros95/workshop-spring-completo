package com.joaomedeiros.spring_completo.resources.exceptions;

import com.joaomedeiros.spring_completo.services.exceptions.ObjectNotFoundException;
import javax.servlet.http.HttpServletRequest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class ResourceExceptionHandler {

    @ExceptionHandler(ObjectNotFoundException.class)
    public ResponseEntity<StandardError> objectNotFound(final ObjectNotFoundException e,
                                                        final HttpServletRequest request) {
        final HttpStatus notFoundStatus = HttpStatus.NOT_FOUND;

        final StandardError err = new StandardError(System.currentTimeMillis(),
                notFoundStatus.value(), "Not Found", e.getMessage(),
                request.getRequestURI());
        return ResponseEntity.status(notFoundStatus).body(err);
    }
}
