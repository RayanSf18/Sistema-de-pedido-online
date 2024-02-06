package com.dev.rayan.webservice.repositories;

import com.dev.rayan.webservice.entities.OrderItem;
import com.dev.rayan.webservice.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderItemRepository extends JpaRepository<OrderItem,Long> {}
