package edu.miu.cs545.mid.controller;

import edu.miu.cs545.mid.entity.Course;
import edu.miu.cs545.mid.entity.Student;
import edu.miu.cs545.mid.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;
import java.util.Optional;

@Controller
@RequestMapping("/students")
public class StudentController {
    @Autowired
    StudentService studentService;
    @GetMapping
    public ResponseEntity<Collection<Student>> getAll(@RequestParam("gpa") Optional<Double> gpa){
        return ResponseEntity.ok(studentService.findByGpaGreaterThan(gpa));
    }

    @GetMapping("{id}")
    public ResponseEntity<Student> getAll(@PathVariable("id") Long id){
        return ResponseEntity.ok(studentService.findById(id));
    }

    @GetMapping("/{studentId}/courses")
    public ResponseEntity<Collection<Course>> getCourses(@PathVariable("studentId") Long studentId){
        return ResponseEntity.ok(studentService.findAllCourses(studentId));
    }

    @GetMapping("/special-filter")
    public ResponseEntity<Collection<Student>> getStudentsCustom(@RequestParam("gpa") Double gpa){
        return ResponseEntity.ok(studentService.specialFilter(gpa));
    }

    @PostMapping("/")
    public ResponseEntity<Void> createStudent(@RequestBody Student student){
        return ResponseEntity.ok().build();
    }

    @PutMapping("/")
    public ResponseEntity<Void> updateStudent(@RequestBody Student student){
        studentService.update(student);
        return ResponseEntity.ok().build();
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteStudent(@PathVariable("id") Long id){
        studentService.deleteById(id);
        return ResponseEntity.ok().build();
    }
}
