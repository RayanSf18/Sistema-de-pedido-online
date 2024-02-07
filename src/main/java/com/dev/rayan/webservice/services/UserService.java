package com.dev.rayan.webservice.services;

import com.dev.rayan.webservice.entities.User;
import com.dev.rayan.webservice.repositories.UserRepository;
import com.dev.rayan.webservice.services.exceptions.DatabaseException;
import com.dev.rayan.webservice.services.exceptions.ResourceNotFoundException;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public User create(User user) {
        return userRepository.save(user);
    }

    public List<User> readAll() {
        return userRepository.findAll();
    }

    public User readById(Long id) {
        Optional<User> optionalUser = userRepository.findById(id);
        return optionalUser.orElseThrow(() -> new ResourceNotFoundException(id));
    }

    public User update(Long id, User newUserDetails) {
        try {
            User existingUser = userRepository.getReferenceById(id);

            updateData(existingUser, newUserDetails);

            return userRepository.save(existingUser);

        } catch (EntityNotFoundException e) {
            throw new ResourceNotFoundException(id);
        }

    }

    public void delete(Long id) {
        if (!userRepository.existsById(id)) {
            throw new ResourceNotFoundException(id);
        }

        try {
            userRepository.deleteById(id);

        } catch (DataIntegrityViolationException e) {
            throw new DatabaseException(e.getMessage());
        }
    }

    // Updating existing user details with new user details
    private void updateData(User existingUser, User newUserDetails) {
        existingUser.setName(newUserDetails.getName());
        existingUser.setEmail(newUserDetails.getEmail());
        existingUser.setPhone(newUserDetails.getPhone());
    }
}
