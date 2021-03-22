package com.proximity.app.service;

import com.proximity.app.exceptions.OperationNotSupportedException;
import com.proximity.app.model.UserType;
import org.springframework.stereotype.Service;

@Service
public class RbacServiceImpl implements RbacService {

    @Override
    public void validate(UserType userType,String methodName) throws OperationNotSupportedException {
        switch (userType) {
            case STUDENT:
                if ("create".equals(methodName)||"edit".equals(methodName)||"delete".equals(methodName)) {
                throw new OperationNotSupportedException(userType);
            }
        }
    }
}
