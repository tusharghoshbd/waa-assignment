package com.miu.post.service;

import com.miu.post.entity.Post;
import com.miu.post.entity.dtos.PostDtos;

import java.util.List;

public interface PostService {

    public List<PostDtos> findAll();

    public List<Post> findAllDetail();

    PostDtos getById(long id);

    Post findById(long id);

    public List<Post> findAllByTitleEqualsIgnoreCase(String title);

    void save(Post p);
}
