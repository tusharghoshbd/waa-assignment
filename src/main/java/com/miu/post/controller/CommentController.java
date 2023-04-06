package com.miu.post.controller;

import com.miu.post.entity.Comment;
import com.miu.post.entity.Post;
import com.miu.post.service.CommentService;
import com.miu.post.service.PostService;
import com.miu.post.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class CommentController {

    private final UserService userService;
    private final PostService postService;
    private final CommentService commentService;
    @Autowired
    public CommentController(UserService userService1, PostService postService1, CommentService commentService1) {
        this.postService = postService1;
        this.userService = userService1;
        this.commentService  = commentService1;
    }
    @PostMapping("/posts/{postId}/comments")
    public void createComment(@PathVariable(value = "postId") Long postId,
                                                 @RequestBody Comment comment) {

        Post post = postService.findById(postId);
        post.getComments().add(comment);
        commentService.save(comment);

    }
}
