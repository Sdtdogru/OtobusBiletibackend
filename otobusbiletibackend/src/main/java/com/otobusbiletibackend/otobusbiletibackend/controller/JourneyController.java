package com.otobusbiletibackend.otobusbiletibackend.controller;

import ch.qos.logback.classic.Logger;
import com.otobusbiletibackend.otobusbiletibackend.entity.Journey;
import com.otobusbiletibackend.otobusbiletibackend.services.JourneyServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.awt.*;
import java.util.List;
@CrossOrigin(origins = "http://localhost:4200")
@RestController
public class JourneyController {
    @Autowired
    private JourneyServiceImpl journeyService;


    @GetMapping("/journey")
    public List<Journey> getAllJourney(){
        return journeyService.findAll();

    }

    @GetMapping("/journey/{id}")
    public  ResponseEntity<Journey> getById(@PathVariable(value = "id",required = true)Long id){

        Journey journey=journeyService.getById(id);
        return ResponseEntity.ok(journey);
    }

    @PostMapping("/add-journey")

    public ResponseEntity<Journey> createJourney(@Valid@RequestBody Journey journey){

        return ResponseEntity.ok(journeyService.addJourney(journey));

    }

    @DeleteMapping("/journey/{id}")
    public ResponseEntity<Boolean> delete(@PathVariable(value = "id",required = true)Long id){
        return ResponseEntity.ok(journeyService.delete(id));
    }

    @PutMapping("/journey/{id}")
    public ResponseEntity<Journey> update(@PathVariable(value = "id",required = true) Long id,@Valid @RequestBody Journey journey){
        return ResponseEntity.ok(journeyService.update(id,journey));
    }

    @PostMapping("/deneme")
    public ResponseEntity<Journey> getByDate(@Valid@RequestBody Journey journey){
        return ResponseEntity.ok(journeyService.getByDate(journey));

    }

}

