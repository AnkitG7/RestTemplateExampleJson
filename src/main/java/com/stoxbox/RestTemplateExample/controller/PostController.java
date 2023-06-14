package com.stoxbox.RestTemplateExample.controller;

import com.stoxbox.RestTemplateExample.services.PostService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PostController {
    private final PostService postService;

    public PostController(PostService postService) {
        this.postService = postService;
    }

    @GetMapping("/posts")
    public String getPosts() {
        return postService.getPosts().toString();
    }
}
