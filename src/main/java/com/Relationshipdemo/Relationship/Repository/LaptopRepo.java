package com.Relationshipdemo.Relationship.Repository;

import com.Relationshipdemo.Relationship.Model.Laptop;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LaptopRepo extends JpaRepository<Laptop,Integer> {
}
