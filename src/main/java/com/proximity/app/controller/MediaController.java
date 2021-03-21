package com.proximity.app.controller;

import com.proximity.app.exceptions.UploadNotSupportedException;
import com.proximity.app.model.Media;
import com.proximity.app.service.MediaServiceImpl;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/media")
public class MediaController extends GenericControllerImpl<MediaServiceImpl, Media> {

    private MediaServiceImpl mediaService;

    public MediaController(MediaServiceImpl service) {
        super(service);
        this.mediaService = service;
    }

    @PostMapping("/upload")
    public ResponseEntity<Boolean> upload(@RequestBody Media media) throws UploadNotSupportedException {
        boolean result = mediaService.upload(media);
        return ResponseEntity.ok(result);
    }

}
