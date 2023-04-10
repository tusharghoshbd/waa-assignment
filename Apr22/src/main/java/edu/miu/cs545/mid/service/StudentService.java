package edu.miu.cs545.mid.service;

import edu.miu.cs545.mid.entity.Course;
import edu.miu.cs545.mid.entity.Student;

import java.util.Collection;
import java.util.Optional;

public interface StudentService {
    Collection<Course> findAllCourses(Long studentId);
    Collection<Student> findByGpaGreaterThan(Optional<Double> gpa);
}
