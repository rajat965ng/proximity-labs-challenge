package com.proximity.app.service;

import com.proximity.app.exceptions.UploadNotSupportedException;
import com.proximity.app.model.Category;
import org.springframework.stereotype.Service;

@Service
public class CategoryServiceImpl extends BaseServiceImpl<Category> {

    @Override
    public boolean upload(Category category) throws UploadNotSupportedException {
        throw new UploadNotSupportedException();
    }
}
