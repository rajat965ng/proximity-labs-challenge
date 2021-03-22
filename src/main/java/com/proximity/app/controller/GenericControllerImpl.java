package com.proximity.app.controller;

import com.proximity.app.exceptions.OperationNotSupportedException;
import com.proximity.app.model.UserType;
import com.proximity.app.service.BaseServiceImpl;
import com.proximity.app.service.RbacService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

public class GenericControllerImpl<K extends BaseServiceImpl<T>,T> implements GenericController<T> {

    private K service;
    private RbacService rbacService;

    public GenericControllerImpl(K service, RbacService rbacService) {
        this.service = service;
        this.rbacService = rbacService;
    }

    @GetMapping
    @Override
    public ResponseEntity<Collection<T>> findAll() {
        return ResponseEntity.ok(service.findAll());
    }

    @PostMapping
    @Override
    public ResponseEntity<Boolean> create(@RequestBody T body, @RequestParam UserType userType) throws OperationNotSupportedException {
        rbacService.validate(userType,"create");
        return ResponseEntity.ok(service.create(body));
    }

    @PutMapping
    @Override
    public ResponseEntity<Boolean> edit(@RequestBody T body, @RequestParam UserType userType) throws OperationNotSupportedException {
        rbacService.validate(userType,"edit");
        T old = service.find(body);
        return ResponseEntity.ok(service.edit(old,body));
    }

    @DeleteMapping
    @Override
    public void delete(@RequestBody T body, @RequestParam UserType userType) throws OperationNotSupportedException {
        rbacService.validate(userType,"delete");
        service.delete(body);
    }


}
