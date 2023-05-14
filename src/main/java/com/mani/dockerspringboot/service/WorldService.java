package com.mani.dockerspringboot.service;

import com.mani.dockerspringboot.model.City;
import com.mani.dockerspringboot.repository.CityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class WorldService {

    @Autowired
    private CityRepository cityRepository;

    public List<City> getCities(String countryCode) {
        return cityRepository.findByCountryCode(countryCode);
    }
}
