package com.dev.rayan.webservice.resources;

import com.dev.rayan.webservice.entities.Address;
import com.dev.rayan.webservice.services.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/addresses")
public class AddressResource {

    @Autowired
    private AddressService AddressService;

    @GetMapping
    public ResponseEntity<List<Address>> findAll() {
        List<Address> AddressList = AddressService.findAll();
        return ResponseEntity.ok().body(AddressList);
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<Address> findById(@PathVariable Long id) {
        Address Address = AddressService.findById(id);
        return ResponseEntity.ok().body(Address);
    }

}
