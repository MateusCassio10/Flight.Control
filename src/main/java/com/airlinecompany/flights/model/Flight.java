package com.airlinecompany.flights.model;

import com.sun.istack.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Entity
@Data
public class Flight {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  Long id;

    @NotNull
    private String departure;

    @NotNull
    private String arrival;

    @NotNull
    private String origin;

    @NotNull
    private String destiny;

    @NotNull
    private String gate;

    @ManyToOne(cascade = CascadeType.PERSIST)
    @JoinColumn(name = "airplane_id")
    @NotNull
    private Airplane airplane;

    @ManyToOne(cascade = CascadeType.PERSIST)
    @JoinColumn(name = "pilot_id")
    @NotNull
    private Pilot pilot;

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinColumn(name = "flight_Status_id")
    private List<FlightStatus> flightStatus;
}
