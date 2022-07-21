package ru.kata.spring.boot_security.demo.service;


import ru.kata.spring.boot_security.demo.models.User;

import java.util.List;

public interface UserService {
    User findById(Long id);

    List<User> findAll();

    void saveUser(User user);

    void deleteUser(Long id);

    public User findByUser(String email);
}
