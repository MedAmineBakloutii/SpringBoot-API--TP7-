package com.api.realestate.repositories;

import com.api.realestate.entities.RentalContract;
import org.springframework.data.jpa.repository.JpaRepository;
public interface RentalContractRepository extends JpaRepository<RentalContract, Long> {

}
