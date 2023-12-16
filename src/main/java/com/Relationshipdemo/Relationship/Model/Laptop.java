package com.Relationshipdemo.Relationship.Model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class Laptop {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
    private int laptopId;
    private String laptopModel;
    private String laptopBrand;
@OneToOne(mappedBy = "laptop",cascade = CascadeType.ALL)
    private Student student;
}
