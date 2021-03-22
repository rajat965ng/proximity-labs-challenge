package com.proximity.app.controller;

import com.proximity.app.model.Media;
import com.proximity.app.service.MediaServiceImpl;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/media")
public class MediaController extends GenericControllerImpl<MediaServiceImpl, Media> {

    public MediaController(MediaServiceImpl service) { super(service); }

}
