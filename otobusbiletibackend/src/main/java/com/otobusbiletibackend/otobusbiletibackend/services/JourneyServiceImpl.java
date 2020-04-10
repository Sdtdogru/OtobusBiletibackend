package com.otobusbiletibackend.otobusbiletibackend.services;

import com.otobusbiletibackend.otobusbiletibackend.entity.Journey;
import com.otobusbiletibackend.otobusbiletibackend.entity.Users;
import com.otobusbiletibackend.otobusbiletibackend.repository.JourneyRepository;
import org.aspectj.bridge.IMessage;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;
import org.springframework.ui.ModelMap;

import java.util.List;

@Service
public class JourneyServiceImpl implements JourneyService{
    @Autowired
    private JourneyRepository journeyRepository;
    private JdbcTemplate jdbcTemplate;
    public JourneyServiceImpl(JourneyRepository journeyRepository){
        this.journeyRepository=journeyRepository;

    }

    @Override
    public Journey addJourney(Journey journey) {

    List<Journey> journey1=journeyRepository.findAll();
    Journey journey2= new Journey();
    for (int i=1; i<journey1.size(); i++){
        journey2= journey1.get(i);
            if (journey.getStartDate()==journey2.getStartDate())
                if (journey.getStartTime()==journey2.getStartTime())
            throw new IllegalArgumentException("aynı kayıt eklenemez!!");
            }

        journeyRepository.save(journey);


        return journey;
    }

    @Override
    public Journey getById(Long id) {
        Journey journey=journeyRepository.getOne(id);
        return jdbcTemplate.queryForObject("select * from journey where id=?",new Object[]{
                id
        },
                new BeanPropertyRowMapper<>(Journey.class));
    }


    @Override
    public List<Journey> findAll() {
        return journeyRepository.findAll();
    }

    @Override
    public List<Journey> findPrice(Journey price) {
        return null;
    }

    @Override
    public Boolean delete(Journey journey) {
        return null;
    }

    @Override
    public Journey update(Long id, Journey journey) {
        Journey journeyDb=journeyRepository.getOne(id);
        if (journeyDb==null)
            throw new IllegalArgumentException("Journey Does Not Exist ID:" + id);

        journeyDb.setStartLocation(journey.getStartLocation());
        journeyDb.setFinishLocation(journey.getFinishLocation());
        journeyDb.setStartDate(journey.getStartDate());
        journeyDb.setStartTime(journey.getStartTime());
        journeyDb.setCapacity(journey.getCapacity());
        journeyDb.setPlaque(journey.getPlaque());
        journeyDb.setDriverName(journey.getDriverName());
        journeyRepository.save(journeyDb);

        return journeyDb;
    }

    @Override
    public Journey getByDate(Journey journey) {
        Journey journey1 = new Journey();

        return journeyRepository.findByStartLocation(journey.getStartLocation());
    }

    public Boolean delete(Long id) {
        journeyRepository.deleteById(id);
        return true;
    }


}
