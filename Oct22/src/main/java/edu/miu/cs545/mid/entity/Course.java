package edu.miu.cs545.mid.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Data
@Entity
@Table(name = "Course")
public class Course {
    @Id
    long id;
    String name;
    @OneToOne(mappedBy = "course", cascade = CascadeType.REMOVE)
    CourseDetails courseDetails;
    @ManyToMany(mappedBy = "courses")
    List<Student> students;

}
