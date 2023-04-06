package com.miu.post.repo;

import com.miu.post.entity.Post;
import com.miu.post.entity.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;
@Repository
public interface UserRepo extends CrudRepository<User,Integer> {
    @Override
    List<User> findAll();

//    @Override
//    Iterable<User> findAllById(Iterable<Integer> integers);

    @Override
    Optional<User> findById(Integer integer);

    //    public List<User> findAll();

//    public User getById(long id);

//
//    @Override
//    <S extends User> S save(S entity);
}
