package com.proximity.app.controller;

import org.springframework.http.ResponseEntity;

import java.util.Collection;

public interface GenericController<T> {

    public ResponseEntity<Boolean> create(T body);
    public ResponseEntity<Boolean> edit(T body);
    public ResponseEntity<Collection<T>> findAll();
    public void delete(T body);
}
