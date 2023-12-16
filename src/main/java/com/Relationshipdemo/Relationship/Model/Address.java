package com.Relationshipdemo.Relationship.Model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Address {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int addressId;
    private String completeAddress;
    private String street;
    private String country;
    @ManyToOne
    @JoinColumn(name = "StudentId")
    @JsonIgnoreProperties(value = "address")
    private Student student;
}
