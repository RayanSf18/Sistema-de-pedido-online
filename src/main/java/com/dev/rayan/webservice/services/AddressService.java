package com.dev.rayan.webservice.services;

import com.dev.rayan.webservice.entities.Address;
import com.dev.rayan.webservice.repositories.AddressRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AddressService {

    @Autowired
    private AddressRepository AddressRepository;

    public List<Address> findAll() {
        return AddressRepository.findAll();
    }

    public Address findById(Long id) {
        Optional<Address> optionalAddress = AddressRepository.findById(id);
        return optionalAddress.get();
    }

}
