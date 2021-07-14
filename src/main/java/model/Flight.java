package model;

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
    private String departure;
    private String arrival;
    private String origin;
    private String destiny;


    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    public List<FlightStatus> flightStatus;

}
