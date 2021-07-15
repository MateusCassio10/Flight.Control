package com.airlinecompany.flights.repository;

import com.airlinecompany.flights.model.Flight;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FlightRepository extends JpaRepository<Flight, Long>{

}
