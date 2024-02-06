package com.dev.rayan.webservice.repositories;

import com.dev.rayan.webservice.entities.Order;
import com.dev.rayan.webservice.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderRepository extends JpaRepository<Order,Long> {}
