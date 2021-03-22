package com.proximity.app.service;

import com.proximity.app.exceptions.UploadNotSupportedException;
import com.proximity.app.model.Content;
import com.proximity.app.model.Tag;
import org.springframework.stereotype.Service;

import java.util.Objects;

@Service
public class TagServiceImpl extends BaseServiceImpl<Tag> {

    @Override
    public boolean upload(Tag tag) throws UploadNotSupportedException {
        throw new UploadNotSupportedException();
    }

    public void updateTagsByContent(Content content) {
        for (String tag : content.getTags()) {

            Tag latest = new Tag(tag);
            Tag old = this.find(latest);
            if (Objects.nonNull(old)){
                old.add(content);
                this.edit(latest,old);
            }else {
                latest.add(content);
                this.create(latest);
            }
        }
    }
}
