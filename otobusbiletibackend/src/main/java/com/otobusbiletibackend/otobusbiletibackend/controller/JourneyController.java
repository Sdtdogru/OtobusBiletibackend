package com.otobusbiletibackend.otobusbiletibackend.controller;

import com.otobusbiletibackend.otobusbiletibackend.services.JourneyService;
import com.otobusbiletibackend.otobusbiletibackend.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;

public class JourneyController {
    @Autowired
    private JourneyService journeyService;
}
