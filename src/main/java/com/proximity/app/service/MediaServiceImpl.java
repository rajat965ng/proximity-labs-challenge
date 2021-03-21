package com.proximity.app.service;

import com.proximity.app.exceptions.UploadNotSupportedException;
import com.proximity.app.model.Media;
import com.proximity.app.model.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MediaServiceImpl extends BaseServiceImpl<Media> {

    @Autowired
    TagServiceImpl tagService;

    @Override
    public boolean upload(Media media) throws UploadNotSupportedException {
        boolean result = super.upload(media);

        for (String tag : media.getTags()) {
            Tag tagObj = new Tag();
            tagObj.setName(tag);
            tagObj.add(media);
            tagService.create(tagObj);
        }

        return result;
    }
}
