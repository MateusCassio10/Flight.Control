package com.airlinecompany.flights.controller;

import com.airlinecompany.flights.model.Flight;
import com.airlinecompany.flights.service.FlightDataService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
@RequestMapping("/flight")
public class FlightDataController {

    @Autowired
    private FlightDataService flightDataService;

    @GetMapping
    public List<Flight> listFlights(Flight flight){
        return flightDataService.findAll(flight);
    }
}
