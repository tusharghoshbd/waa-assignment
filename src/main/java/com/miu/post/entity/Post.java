package com.miu.post.entity;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "posts")
public class Post {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String title;
    private String content;
    private String author;

    @OneToMany( cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinColumn(name = "post_id")
    private List<Comment> comments;

//    @ManyToOne(fetch = FetchType.LAZY)
//    private User user;

//    public Post(long id, String title, String content, String author) {
//        this.id = id;
//        this.title = title;
//        this.content = content;
//        this.author = author;
//    }
}
