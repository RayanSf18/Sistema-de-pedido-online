package com.dev.rayan.webservice.services;

import com.dev.rayan.webservice.entities.Order;
import com.dev.rayan.webservice.entities.User;
import com.dev.rayan.webservice.repositories.OrderRepository;
import com.dev.rayan.webservice.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class OrderService {

    @Autowired
    private OrderRepository orderRepository;

    public List<Order> findAll() {
        return orderRepository.findAll();
    }

    public Order findById(Long id) {
        Optional<Order> optionalOrder = orderRepository.findById(id);
        return optionalOrder.get();
    }

}
