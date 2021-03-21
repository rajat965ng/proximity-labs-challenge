package com.proximity.app.service;

import com.proximity.app.exceptions.UploadNotSupportedException;

import java.util.Collection;

public interface BaseService<T> {
    public boolean create(T t);
    public boolean edit(T old,T updated);
    public void delete(T t);
    public boolean upload(T t) throws UploadNotSupportedException;
    public T find(T t);
    public int findIndex(T t);
    public Collection<T> findAll();
}
