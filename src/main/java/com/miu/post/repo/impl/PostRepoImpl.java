package com.miu.post.repo.impl;

import com.miu.post.entity.Post;
import com.miu.post.repo.PostRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
@Repository
@RequiredArgsConstructor
public class PostRepoImpl {
    private static List<Post> posts;
    private static int postId = 300;
    static {
        posts = new ArrayList<>();
//        Post p1 = new Post(postId++,"Nice day","Content of nice day", "Tushar");
//        Post p2 = new Post(postId++,"Sunny day","Content of sunny day", "Ghosh");
//        posts.add(p1);
//        posts.add(p2);
    }


    public List<Post> findAll(){
        return posts;
    }


    public Post getById(long id) {
        return posts
                .stream()
                .filter(l -> l.getId() == id)
                .findFirst()
                .orElse(null);

    }

    public void save(Post p) {
        p.setId(postId++);
        posts.add(p);
    }


}
