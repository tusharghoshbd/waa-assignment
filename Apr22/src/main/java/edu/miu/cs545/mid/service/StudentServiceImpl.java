package edu.miu.cs545.mid.service;

import edu.miu.cs545.mid.entity.Course;
import edu.miu.cs545.mid.entity.Student;
import edu.miu.cs545.mid.repository.StudentRepository;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Optional;

@Service
public class StudentServiceImpl implements StudentService{
    @Autowired
    StudentRepository studentRepository;
    @Override
    public Collection<Course> findAllCourses(Long studentId) {
        return studentRepository.findById(studentId).orElseThrow().getCourses();
    }

    @Override
    public Collection<Student> findByGpaGreaterThan(Optional<Double> gpa) {
        if(gpa.isPresent()){
            return studentRepository.findByGpaGreaterThan(gpa.get());
        }
        Collection<Student> students = new ArrayList<>();
        studentRepository.findAll().forEach(students::add);
        return students;
    }
}
