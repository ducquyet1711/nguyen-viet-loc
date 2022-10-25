package com.nguyenvietloc.tutorials.service;

import com.nguyenvietloc.tutorials.model.User;

public interface UserService {
    void save(User user);

    User findByUsername(String username);
}
