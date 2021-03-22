package com.proximity.app.service;

import com.proximity.app.exceptions.UploadNotSupportedException;
import com.proximity.app.model.Category;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CategoryServiceImpl extends BaseServiceImpl<Category> {

    @Autowired
    TagServiceImpl tagService;

    @Autowired
    MediaServiceImpl mediaService;

    @Override
    public boolean upload(Category category) throws UploadNotSupportedException {
        throw new UploadNotSupportedException();
    }

    @Override
    public boolean create(Category category) {
        boolean result = super.create(category);
        category.getMedia().forEach(mediaService::create);
        tagService.updateTagsByContent(category);
        return result;
    }
}
