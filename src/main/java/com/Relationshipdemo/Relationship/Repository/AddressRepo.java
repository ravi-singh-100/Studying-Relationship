package com.Relationshipdemo.Relationship.Repository;

import com.Relationshipdemo.Relationship.Model.Address;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AddressRepo extends JpaRepository<Address,Integer> {
}
