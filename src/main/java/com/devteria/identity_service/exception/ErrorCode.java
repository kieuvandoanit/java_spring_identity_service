package com.devteria.identity_service.exception;

public enum ErrorCode {
    UNCATEGORIZED_EXCEPTION(9999, "Uncategorized Exception"),
    INVALID_KEY(1001, "Invalid message key"),
    USER_EXISTS(1002, "User already exists"),
    USERNAME_INVALID(1003, "Username must be at least 3 characters"),
    PASSWORD_INVALID(1004, "Password must be at least 8 characters"),
    USER_NOT_FOUND(1005, "User not found"),
    UNAUTHENTICATED(1006, "User is not authenticated"),
    ;

    private int code;
    private String message;

    ErrorCode(int code, String message) {
        this.code = code;
        this.message = message;
    }

    public int getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }
}
