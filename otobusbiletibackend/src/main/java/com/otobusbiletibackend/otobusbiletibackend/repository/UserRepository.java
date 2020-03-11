package com.otobusbiletibackend.otobusbiletibackend.repository;

import com.otobusbiletibackend.otobusbiletibackend.entity.Users;
import org.springframework.data.jpa.repository.JpaRepository;

public  interface UserRepository extends JpaRepository<Users,Long> {
}
