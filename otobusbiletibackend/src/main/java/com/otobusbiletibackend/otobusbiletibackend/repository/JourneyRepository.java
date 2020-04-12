package com.otobusbiletibackend.otobusbiletibackend.repository;

import com.otobusbiletibackend.otobusbiletibackend.entity.Journey;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface JourneyRepository extends JpaRepository<Journey,Long> {
    @Async
    @Query("select s from Journey s  where s.startDate  = :startDate")
    List<Journey> findByStartDate(@Param("startDate") String startDate);


    Journey findByStartLocation(String startLocation);

    Journey getByFinishLocation(String finishLocation);
/*
@Query("SELECT u FROM Journey u WHERE u.start_location=?1 AND u.finish_location=?2 AND u.start_date=?3")
Journey getByStartLocationAndFinishLocationAndStartDate(Journey startLocation,Journey finishLocation,Journey startDate);
*/


}
