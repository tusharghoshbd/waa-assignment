package edu.miu.cs545.mid.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Data
@Entity
@Table(name = "Course")
public class Course {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    long id;
    String name;
    @OneToMany(cascade = CascadeType.REMOVE)
    @JoinColumn(name="course_id")
    List<Subject> subjects;
    @ManyToMany(mappedBy = "courses")
    List<Student> students;
}
