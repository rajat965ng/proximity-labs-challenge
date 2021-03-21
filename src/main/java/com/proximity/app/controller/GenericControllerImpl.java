package com.proximity.app.controller;

import com.proximity.app.service.BaseServiceImpl;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

public class GenericControllerImpl<K extends BaseServiceImpl<T>,T> implements GenericController<T> {

    private K service;

    public GenericControllerImpl(K service) {
        this.service = service;
    }

    @GetMapping
    @Override
    public ResponseEntity<Collection<T>> findAll() {
        return ResponseEntity.ok(service.findAll());
    }

    @PostMapping
    @Override
    public ResponseEntity<Boolean> create(@RequestBody T body) {
        return ResponseEntity.ok(service.create(body));
    }

    @PutMapping
    @Override
    public ResponseEntity<Boolean> edit(@RequestBody T body) {
        T old = service.find(body);
        return ResponseEntity.ok(service.edit(old,body));
    }

    @DeleteMapping
    @Override
    public void delete(@RequestBody T body) {
        service.delete(body);
    }


}
