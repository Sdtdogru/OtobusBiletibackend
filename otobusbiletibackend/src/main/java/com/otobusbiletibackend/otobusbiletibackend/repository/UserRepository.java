package com.otobusbiletibackend.otobusbiletibackend.repository;

import com.otobusbiletibackend.otobusbiletibackend.entity.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public  interface UserRepository extends JpaRepository<Users,Long> {

    Users findByUsername(String user);
}
