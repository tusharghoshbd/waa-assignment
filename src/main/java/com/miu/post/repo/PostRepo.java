package com.miu.post.repo;

import com.miu.post.entity.Post;
import com.miu.post.entity.User;
import com.miu.post.entity.dtos.PostDtos;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;
@Repository
public interface PostRepo extends CrudRepository<Post, Integer> {
    @Override
    public List<Post> findAll();

    @Override
    Optional<Post> findById(Integer integer);

    public List<Post> findAllByTitleEqualsIgnoreCase(String title);

    //    public Post getById(long id);
//
//    public void save(Post p);

}
