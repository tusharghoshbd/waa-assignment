package edu.miu.cs545.mid.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.time.Year;

@Data
@Entity
@Table(name = "Course_Details")
public class CourseDetails {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    long descriptionId;
    String courseDetails;
    Long credit;
    String program;
    Year lastUpdated;
    @OneToOne
    Course course;
}
