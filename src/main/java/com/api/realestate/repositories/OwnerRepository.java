package com.api.realestate.repositories;

import com.api.realestate.entities.Owner;
import org.springframework.data.jpa.repository.JpaRepository;
public interface OwnerRepository extends JpaRepository<Owner, Long> {

}
