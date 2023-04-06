package com.miu.post.service.impl;

import com.miu.post.entity.Post;
import com.miu.post.entity.dtos.PostDtos;
import com.miu.post.helper.ListMapper;
import com.miu.post.repo.PostRepo;
import com.miu.post.service.PostService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@RequiredArgsConstructor
public class PostServiceImpl implements PostService {
    @Autowired
    private PostRepo postRepo;

    @Autowired
    ModelMapper modelMapper;

    @Autowired
    ListMapper listMapper;

    public List<PostDtos> findAll() {
//        return postRepo.findAll();
        return (List<PostDtos>) listMapper.mapList(postRepo.findAll(),new PostDtos());
    }

    public List<Post> findAllDetail(){
        return postRepo.findAll();
    }


    public PostDtos getById(long id) {
        return modelMapper.map(postRepo.findById((int)id), PostDtos.class);
//        return postRepo.getById(id);
    }


    @Override
    public void save(Post p) {

        postRepo.save(p);
    }
}
