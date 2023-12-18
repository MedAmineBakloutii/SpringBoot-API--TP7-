package com.api.realestate.services;

import com.api.realestate.entities.RentalContract;
import com.api.realestate.repositories.RentalContractRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class RentalContractService {

    private final RentalContractRepository rentalContractRepository;

    @Autowired
    public RentalContractService(RentalContractRepository rentalContractRepository) {
        this.rentalContractRepository = rentalContractRepository;
    }

    public List<RentalContract> getAllRentalContracts() {
        return rentalContractRepository.findAll();
    }

    public Optional<RentalContract> getRentalContractById(Long id) {
        return rentalContractRepository.findById(id);
    }

    public RentalContract saveRentalContract(RentalContract rentalContract) {
        return rentalContractRepository.save(rentalContract);
    }

    public void deleteRentalContract(Long id) {
        rentalContractRepository.deleteById(id);
    }
}
