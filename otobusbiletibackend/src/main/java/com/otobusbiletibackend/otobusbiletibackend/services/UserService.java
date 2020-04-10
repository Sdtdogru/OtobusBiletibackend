package com.otobusbiletibackend.otobusbiletibackend.services;

import com.otobusbiletibackend.otobusbiletibackend.entity.Users;
import javassist.NotFoundException;

import java.util.List;

public interface UserService {
    public List<Users> findUser(String username) throws NotFoundException;
}
