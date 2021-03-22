package com.proximity.app.exceptions;

import com.proximity.app.model.UserType;

public class OperationNotSupportedException extends Exception {

    public OperationNotSupportedException(UserType userType) {
        super("Operation not supported for "+userType);
    }
}
