package com.miu.post.entity;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

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

//    @ManyToOne(fetch = FetchType.LAZY)
//    private User user;

//    public Post(long id, String title, String content, String author) {
//        this.id = id;
//        this.title = title;
//        this.content = content;
//        this.author = author;
//    }
}
