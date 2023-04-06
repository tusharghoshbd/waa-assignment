package com.miu.post.service.impl;

import com.miu.post.entity.User;
import com.miu.post.repo.UserRepo;
import com.miu.post.repo.impl.UserRepoImpl;
import com.miu.post.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {
    @Autowired
    private final UserRepo userRepo;

    @Override
    public List<User> findAll() {
        return userRepo.findAll();
    }

    @Override
    public User findById(long id) {
        return userRepo.findById((int)id).get();
    }

    @Override
    public void save(User p) {
        userRepo.save(p);
    }

    @Override
    public void deleteById(long id){
        userRepo.deleteById((int)id);
    }
}
