package com.dev.rayan.webservice.repositories;

import com.dev.rayan.webservice.entities.Address;
import com.dev.rayan.webservice.entities.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AddressRepository extends JpaRepository<Address,Long> {}
