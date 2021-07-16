package com.airlinecompany.flights.service;

import com.airlinecompany.flights.model.Flight;
import com.airlinecompany.flights.repository.FlightRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class FlightDataService {

    @Autowired
    private FlightRepository flightRepository;


    public List findAll(Flight flight) {
        return flightRepository.findAll();
    }

    public Flight save(Flight flight) {
        return flightRepository.save(flight);
    }

    public void delete(Flight flight) {
        flightRepository.delete(flight);
    }

    public void edit(Flight flight){
        flightRepository.save(flight);
    }

    public Optional<Flight> findById(Long id) {
        return flightRepository.findById(id);
    }
}
