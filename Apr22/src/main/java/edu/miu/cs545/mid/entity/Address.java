package edu.miu.cs545.mid.entity;

import jakarta.persistence.*;
import lombok.Data;

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

    @OneToOne
    Student student;

}
