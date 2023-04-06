package com.miu.post.repo.impl;

import com.miu.post.entity.Post;
import com.miu.post.entity.User;
import com.miu.post.repo.UserRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
@Repository
@RequiredArgsConstructor
public class UserRepoImpl {
//    public List<User> findAll() {
//        List<Post> posts = new ArrayList<>();
//        Post p1 = new Post(100,"Nice day","Content of nice day", "Tushar");
//        Post p2 = new Post(101,"Sunny day","Content of sunny day", "Ghosh");
//        posts.add(p1);
//        posts.add(p2);
//
//        List<User>  user = new ArrayList<>();
//        User user1 = new User(1,"Devid");
//        user.add(user1);
//
//        return user;
//    }


    public User getById(long id) {
        return null;
    }

    public void save(User p) {

    }
}
