package edu.miu.cs545.mid.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Data
@Entity
@Table(name = "Address")
public class Address {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    long id;
    String city;
    String state;
    String zipcode;

    @OneToMany(mappedBy = "address")
    List<Student> students;

}
