package com.proximity.app.service;

import com.proximity.app.exceptions.OperationNotSupportedException;
import com.proximity.app.model.UserType;

public interface RbacService {
    void validate(UserType userType,String methodName) throws OperationNotSupportedException;
}
