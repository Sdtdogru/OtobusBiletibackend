package com.otobusbiletibackend.otobusbiletibackend.services;

import com.otobusbiletibackend.otobusbiletibackend.entity.Users;
import com.otobusbiletibackend.otobusbiletibackend.repository.UserRepository;
import javassist.NotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserRepository userRepository;

    @Override
    public List<Users> findUser(String username) throws NotFoundException {
        Users users=userRepository.findByUsername(username);
        if (users==null){
            throw new NotFoundException(username);
        }
        return (List<Users>) userRepository.findByUsername(username);//listdondur
    }
}
