package com.airlinecompany.flights.controller;

import com.airlinecompany.flights.model.Airplane;
import com.airlinecompany.flights.model.Flight;
import com.airlinecompany.flights.service.FlightDataService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;


@RestController
@RequestMapping("/flight")
public class FlightDataController {

    @Autowired
    private FlightDataService flightDataService;

    @PostMapping("/register")
    public Flight dataFlight(@RequestBody Flight flight){
        return flightDataService.save(flight);
    }

    @GetMapping("/list")
    public List listFlights(Flight flight){
        return flightDataService.findAll(flight);
    }

    @GetMapping("list/{id}")
    public Optional<Flight> listUniqueFlight(@PathVariable(value = "id") Long id){
        return flightDataService.findById(id);
    }

    @DeleteMapping("/delete")
    public void deleteFlight(@RequestBody Flight flight) {
        flightDataService.delete(flight);
    }

    @PutMapping("/modify")
    public Flight EditFlight(@RequestBody Flight flight){
        return flightDataService.save(flight);
    }
}
