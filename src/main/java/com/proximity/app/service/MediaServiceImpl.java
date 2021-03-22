package com.proximity.app.service;

import com.proximity.app.model.Media;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MediaServiceImpl extends BaseServiceImpl<Media> {

    @Autowired
    TagServiceImpl tagService;


    @Override
    public boolean create(Media media) {
        boolean result = super.create(media);
        tagService.updateTagsByContent(media);
        return result;
    }
}
