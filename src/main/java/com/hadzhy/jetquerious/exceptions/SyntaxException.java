package com.hadzhy.jetquerious.exceptions;

public class SyntaxException extends RepositoryException {
    public SyntaxException(String errorCode, String message) {
        super(errorCode, message);
    }
}
