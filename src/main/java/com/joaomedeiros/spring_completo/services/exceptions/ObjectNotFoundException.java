package com.joaomedeiros.spring_completo.services.exceptions;

public class ObjectNotFoundException extends RuntimeException {
    private static final long serialVersionUID = -5887574814057959857L;

    public ObjectNotFoundException(final String msg) {
        super(msg);
    }

    public ObjectNotFoundException(final String msg, final Throwable cause) {
        super(msg, cause);
    }
}
