package com.airlinecompany.flights.repository;

import com.airlinecompany.flights.model.FlightStatus;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FlightStatusRepository extends JpaRepository<FlightStatus, Long> {
}
