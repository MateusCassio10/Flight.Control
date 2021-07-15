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
@Table(name = "flight")
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

    @ManyToOne(cascade = CascadeType.PERSIST)
    @JoinColumn(name = "airplane_id")
    @NotNull
    private Airplane airplane;

    @ManyToOne(cascade = CascadeType.PERSIST)
    @JoinColumn(name = "pilot_id")
    @NotNull
    private Pilot pilot;

    @OneToMany(mappedBy = "flight", cascade = CascadeType.ALL, fetch =FetchType.EAGER)
    private List<FlightStatus> flightStatus;
}
