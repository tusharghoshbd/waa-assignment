package edu.miu.cs545.mid.controller;

import edu.miu.cs545.mid.annotations.Alert;
import edu.miu.cs545.mid.entity.Course;
import edu.miu.cs545.mid.entity.Student;
import edu.miu.cs545.mid.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.swing.text.html.Option;
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

    @GetMapping("/{studentId}/courses")
    public ResponseEntity<Collection<Course>> getCourses(@PathVariable("studentId") Long studentId){
        return ResponseEntity.ok(studentService.findAllCourses(studentId));
    }

    @Alert
    @GetMapping("/create")
    public ResponseEntity<Collection<Course>> createCourses(){
        return ResponseEntity.ok().build();
    }

    @GetMapping("/delete")
    public ResponseEntity<Collection<Course>> deleteCourses(){
        return ResponseEntity.ok().build();
    }

    @Alert
    @GetMapping("/update")
    public ResponseEntity<Collection<Course>> updateCourses(){
        return ResponseEntity.ok().build();
    }

}
