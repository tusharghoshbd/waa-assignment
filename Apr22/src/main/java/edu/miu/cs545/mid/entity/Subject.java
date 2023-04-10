package edu.miu.cs545.mid.entity;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "Subject")
public class Subject {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    long id;
    String topic;
    @ManyToOne
    Course course;
}
