package com.miu.post.service.impl;

import com.miu.post.entity.Comment;
import com.miu.post.entity.Post;
import com.miu.post.repo.CommentRepo;
import com.miu.post.repo.PostRepo;
import com.miu.post.service.CommentService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CommentServiceImpl implements CommentService {

    @Autowired
    private CommentRepo commentRepo;

    @Override
    public void save(Comment p) {
        commentRepo.save(p);
    }
}
