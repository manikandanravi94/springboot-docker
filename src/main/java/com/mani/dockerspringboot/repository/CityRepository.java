package com.mani.dockerspringboot.repository;

import com.mani.dockerspringboot.model.City;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CityRepository extends CrudRepository<City, Integer> {

    public List<City> findByCountryCode(String countryCode);
}
