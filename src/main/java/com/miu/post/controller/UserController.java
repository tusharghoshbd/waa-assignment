package com.miu.post.controller;

import com.miu.post.entity.Post;
import com.miu.post.entity.User;
import com.miu.post.entity.dtos.PostDtos;
import com.miu.post.service.PostService;
import com.miu.post.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("/api/users")
public class UserController {
    private final UserService userService;
    private final PostService postService;
    @Autowired
    public UserController(UserService userService1, PostService postService1) {
        this.postService = postService1;
        this.userService = userService1;
    }

    @GetMapping(value = "/")
    public List<User> findAll() {
        return userService.findAll();
    }


    @GetMapping("/{id}/posts")
    public ResponseEntity<List<Post>> getAllPost(@PathVariable(value = "id") Long id) {
        User user = userService.findById(id);
        System.out.println( user.toString());
        return new ResponseEntity<>(user.getPosts(), HttpStatus.OK) ;
    }

    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping("/")
    public void save(@RequestBody User p) {
        userService.save(p);
    }

//    @PostMapping("/{id}/posts")
//    public void savePost(@PathVariable(value = "id") Long id, @RequestBody Post post) {
//        User user = userService.findById(id);
//        post.setUser(user);
//        postService.save(post);
//    }


}
