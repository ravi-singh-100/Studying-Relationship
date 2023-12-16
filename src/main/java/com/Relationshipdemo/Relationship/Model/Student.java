package com.Relationshipdemo.Relationship.Model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

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

    @OneToMany(mappedBy = "student",cascade = CascadeType.ALL)
            @JsonIgnoreProperties(value = "student")
    List<Address> address;
}
