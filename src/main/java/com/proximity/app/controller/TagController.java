package com.proximity.app.controller;

import com.proximity.app.model.Tag;
import com.proximity.app.service.RbacService;
import com.proximity.app.service.TagServiceImpl;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/tag")
public class TagController extends GenericControllerImpl<TagServiceImpl,Tag> {

    public TagController(TagServiceImpl service, RbacService rbacService) {
        super(service, rbacService);
    }
}
