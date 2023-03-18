package com.driver.model;

import com.driver.model.TripStatus;
import lombok.*;

import javax.persistence.*;

@Data
@NoArgsConstructor
@Getter
@Setter
@AllArgsConstructor
@Entity
public class TripBooking {
    @javax.persistence.Id
    @GeneratedValue(strategy = GenerationType.AUTO)
     private int tripBookingId;

     private String fromLocation;

     private String toLocation;

     private int distanceInKm;

     private int bill;

     @Enumerated(EnumType.STRING)
     private TripStatus status;

     @ManyToOne
     Driver driver;

     @ManyToOne
     Customer customer;

}