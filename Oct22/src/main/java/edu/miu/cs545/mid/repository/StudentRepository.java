package edu.miu.cs545.mid.repository;

import edu.miu.cs545.mid.entity.Student;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Collection;

@Repository
public interface StudentRepository extends CrudRepository<Student, Long> {
    Collection<Student> findByGpaGreaterThan(Double gpa);
    @Query("SELECT student FROM Student student JOIN student.courses course JOIN course.courseDetails details WHERE details.program = 'MSC' AND student.gpa > :gpa")
    Collection<Student> findGivenCriteria(Double gpa);
}
