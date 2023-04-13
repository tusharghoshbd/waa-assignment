package com.miu.post.repo;

import com.miu.post.entity.Post;
import com.miu.post.entity.User;
import org.springframework.data.jpa.repository.Query;
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

    User findByEmail(String email);
    @Override
    Optional<User> findById(Integer integer);

    @Query(value = "SELECT * FROM users u WHERE u.id IN (SELECT p.user_id FROM posts p GROUP BY p.user_id HAVING count(*) > :num)", nativeQuery = true)
    public List<User> findAllByPostsGreaterThan(int num);



    //    public List<User> findAll();

//    public User getById(long id);

//
//    @Override
//    <S extends User> S save(S entity);
}
