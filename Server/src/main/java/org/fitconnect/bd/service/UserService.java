package org.fitconnect.bd.service;

import org.fitconnect.bd.repository.UserRepository;
import org.fitconnect.bd.model.TUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    public List<TUser> getAll() {
        return userRepository.findAll(); // Placeholder, reemplaza con la implementación real
    }
}
