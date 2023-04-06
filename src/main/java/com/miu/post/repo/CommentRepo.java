package com.miu.post.repo;

import com.miu.post.entity.Comment;
import com.miu.post.entity.Post;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CommentRepo  extends CrudRepository<Comment, Integer> {

    @Override
    public List<Comment> findAll();
}
