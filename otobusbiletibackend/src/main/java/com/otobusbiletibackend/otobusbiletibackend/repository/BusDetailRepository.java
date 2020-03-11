package com.otobusbiletibackend.otobusbiletibackend.repository;

import com.otobusbiletibackend.otobusbiletibackend.entity.BusDetail;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BusDetailRepository extends JpaRepository< BusDetail,Long> {
}
