package com.proximity.app.service;

import com.proximity.app.exceptions.UploadNotSupportedException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

@Service
public class BaseServiceImpl<T> implements BaseService<T> {

    private List<T> store;

    public BaseServiceImpl() {
        this.store = new ArrayList<>();
    }

    @Override
    public boolean create(T t) {
        return store.add(t);
    }

    @Override
    public boolean edit(T old, T updated) {
        int index = this.findIndex(old);
        store.add(index,updated);
        return true;
    }

    @Override
    public void delete(T t) {
        store.remove(t);
    }

    @Override
    public boolean upload(T t) throws UploadNotSupportedException {
        return store.add(t);
    }

    @Override
    public T find(T t) {
        int index =  this.findIndex(t);
        return store.get(index);
    }

    @Override
    public int findIndex(T t) {
        return store.indexOf(t);
    }

    @Override
    public Collection<T> findAll() {
        return store;
    }
}
