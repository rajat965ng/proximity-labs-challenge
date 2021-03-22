package com.proximity.app.controller;

import com.proximity.app.exceptions.OperationNotSupportedException;
import com.proximity.app.model.UserType;
import org.springframework.http.ResponseEntity;

import java.util.Collection;

interface GenericController<T> {
    ResponseEntity<Boolean> create(T body, UserType userType) throws OperationNotSupportedException;
    ResponseEntity<Boolean> edit(T body, UserType userType) throws OperationNotSupportedException;
    ResponseEntity<Collection<T>> findAll();
    void delete(T body, UserType userType) throws OperationNotSupportedException;
}
