package com.psuti.Popko.controller;

import com.psuti.Popko.service.DTO.FileUploadResponse;
import com.psuti.Popko.service.util.PostImageService;
import org.apache.tomcat.util.http.fileupload.impl.InvalidContentTypeException;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

@RestController
@RequestMapping("/posts/images/")
public class FileRestController {
    private final PostImageService postImageService;

    public FileRestController(PostImageService postImageService) {
        this.postImageService = postImageService;
    }

    @PostMapping
    public FileUploadResponse create(@RequestParam("img")
                                     MultipartFile multipartFile)
            throws InvalidContentTypeException {
        if (!multipartFile.getContentType().contains("image")) {
            throw new InvalidContentTypeException("File isn't img");
        }
        return postImageService.upload(multipartFile);
    }

    @GetMapping
    @RequestMapping
    public byte[] download(@RequestParam("img_path") String imgPath) {
        return postImageService.download(imgPath);
    }
}
