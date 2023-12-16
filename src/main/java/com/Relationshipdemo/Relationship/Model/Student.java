package com.Relationshipdemo.Relationship.Model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@AllArgsConstructor
@Data@NoArgsConstructor
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
   private int studentId;
    private String studentName;
    private int age;
    @OneToOne
    @JoinColumn(name = "laptopId")
    private Laptop laptop;
}
