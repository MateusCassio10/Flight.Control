package com.airlinecompany.flights.controller;

import com.airlinecompany.flights.service.FlightDataService;
import model.Flight;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
@RequestMapping
public class FlightDataController {

    @Autowired
    private FlightDataService flightDataService;

    @GetMapping("/flight")
    public List<Flight> listFlights(Flight flight){
        return flightDataService.findAll(flight);
    }
}
