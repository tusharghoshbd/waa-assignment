package com.miu.post.controller;

import com.miu.post.entity.Post;
import com.miu.post.entity.dtos.PostDtos;
import com.miu.post.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/posts")
public class PostController {

    private final PostService postService;
    @Autowired
    public PostController(PostService postService1) {
        this.postService = postService1;
    }

    @GetMapping(value = "/")
    public List<PostDtos> findAll() {
        return postService.findAll();
    }

    @GetMapping(value = "/", headers = {"API-VERSION=v2"})
    public List<Post> findAllV2() {
        return postService.findAllDetail();
    }

    @GetMapping("/{id}")
    public ResponseEntity<PostDtos> getById(@PathVariable long id) {
        var post = postService.getById(id);
        return ResponseEntity.ok(post);
    }

    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping
    public void save(@RequestBody Post p) {
        postService.save(p);
    }

}
