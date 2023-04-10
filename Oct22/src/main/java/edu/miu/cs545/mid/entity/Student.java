package edu.miu.cs545.mid.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Data
@Entity
@Table(name = "Student")
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    long id;
    String name;
    double gpa;
    @ManyToOne(fetch = FetchType.LAZY)
    Address address;
    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(name = "Student_Course",
                joinColumns = {@JoinColumn(name = "student_id")}, inverseJoinColumns = {@JoinColumn(name="course_id")})
    List<Course> courses;
}
