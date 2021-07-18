package com.airlinecompany.flights.service;

import com.airlinecompany.flights.model.Flight;
import com.airlinecompany.flights.repository.FlightRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FlightDataService {

    @Autowired
    private FlightRepository flightRepository;


    public List findAll(Flight flight) {
        return flightRepository.findAll();
    }

}


