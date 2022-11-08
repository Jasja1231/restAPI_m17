package com.softserve.itacademy.service;

import com.softserve.itacademy.model.User;

import java.util.List;
import java.util.Optional;

public interface UserService {
    User create(User user);
    User readById(long id);
    User update(User user);
    void delete(long id);

    List<User> getAll();

    Optional<User> findByEmail(String email);

}
