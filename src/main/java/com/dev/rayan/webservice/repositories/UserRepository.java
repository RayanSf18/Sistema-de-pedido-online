package com.dev.rayan.webservice.repositories;

import com.dev.rayan.webservice.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> { }
