package com.proximity.app.service;

import com.proximity.app.exceptions.UploadNotSupportedException;

import java.util.Collection;

interface BaseService<T> {
     boolean create(T t);
     boolean edit(T old,T updated);
     void delete(T t);
     boolean upload(T t) throws UploadNotSupportedException;
     T find(T t);
     int findIndex(T t);
     Collection<T> findAll();
}
