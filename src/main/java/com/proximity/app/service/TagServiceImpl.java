package com.proximity.app.service;

import com.proximity.app.exceptions.UploadNotSupportedException;
import com.proximity.app.model.Tag;
import org.springframework.stereotype.Service;

@Service
public class TagServiceImpl extends BaseServiceImpl<Tag> {

    @Override
    public boolean upload(Tag tag) throws UploadNotSupportedException {
        throw new UploadNotSupportedException();
    }
}
