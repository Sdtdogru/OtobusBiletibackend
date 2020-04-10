package com.otobusbiletibackend.otobusbiletibackend.services;

import com.otobusbiletibackend.otobusbiletibackend.entity.Journey;
import com.otobusbiletibackend.otobusbiletibackend.entity.Users;
import com.otobusbiletibackend.otobusbiletibackend.repository.JourneyRepository;
import com.sun.org.apache.xpath.internal.operations.Bool;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.print.attribute.standard.JobImpressions;
import java.util.List;
@Service
public interface JourneyService {


    Journey addJourney(Journey journey);

    Journey getById(Long id);

    List<Journey> findAll();

    List<Journey> findPrice(Journey price);

    Boolean delete(Journey journey);

    Journey update(Long id,Journey journey);

    Journey getByDate(Journey journey);


}
