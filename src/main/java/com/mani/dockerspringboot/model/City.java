package com.mani.dockerspringboot.model;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name="city")
@Data
public class City {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Integer id;

    @Column(name="name")
    private String name;

    @Column(name="countrycode")
    private String countryCode;

    @Column(name="district")
    private String district;

    @Column(name = "population")
    private Integer population;

}
