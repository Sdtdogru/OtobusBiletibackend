package com.otobusbiletibackend.otobusbiletibackend.controller;

import com.otobusbiletibackend.otobusbiletibackend.services.BusDetailService;
import com.otobusbiletibackend.otobusbiletibackend.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class BusDetailController {
    @Autowired
    private BusDetailService busDetailService;
}
