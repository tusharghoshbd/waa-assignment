package com.miu.post.service;

import com.miu.post.entity.Post;
import com.miu.post.entity.User;
import com.miu.post.entity.dtos.PostDtos;

import java.util.List;

public interface UserService {


    public List<User> findAll();

    User findById(long id);

    void save(User p);
}
