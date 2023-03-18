package com.driver.model;

import lombok.*;

import javax.persistence.*;

@Data
@NoArgsConstructor
@Getter
@Setter
@AllArgsConstructor
@Entity
public class Cab {
    @javax.persistence.Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int Id;

    private int perKmRate;

    Boolean isAvailable;

    @OneToOne(mappedBy = "cab", cascade = CascadeType.ALL)
    Driver driver;
}