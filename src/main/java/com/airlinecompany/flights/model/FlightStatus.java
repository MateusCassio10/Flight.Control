package com.airlinecompany.flights.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;


@AllArgsConstructor
@NoArgsConstructor
@Entity
@Data
public class FlightStatus {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String status;
    private String time;

    @ManyToOne
    @JsonIgnore
    private Flight flight;

}
