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

    @PostMapping("/date")
    public Flight dataFlight(@RequestBody Flight flight){
        return flightDataService.save(flight);
    }


    @GetMapping("/list")
    public List<Flight> listFlights(Flight flight){
        return flightDataService.findAll(flight);
    }

    @DeleteMapping("/delete")
    public void deletaProduto(@RequestBody Flight flight) {
        flightDataService.delete(flight);
    }
}
