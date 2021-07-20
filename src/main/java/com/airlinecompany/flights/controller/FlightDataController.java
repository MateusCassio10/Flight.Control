package com.airlinecompany.flights.controller;

import com.airlinecompany.flights.model.Flight;
import com.airlinecompany.flights.service.FlightDataService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/flight")
public class FlightDataController {

    @Autowired
    private FlightDataService flightDataService;

    @GetMapping
    public List listFlight(Flight flight){
        return flightDataService.findAll(flight);
    }


}
