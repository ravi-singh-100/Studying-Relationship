package com.Relationshipdemo.Relationship.Repository;

import com.Relationshipdemo.Relationship.Model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepo extends JpaRepository<Student,Integer> {
}
