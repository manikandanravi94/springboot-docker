package com.mani.dockerspringboot.controller;

import com.mani.dockerspringboot.model.City;
import com.mani.dockerspringboot.service.WorldService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class WorldController {

    @Autowired
    private WorldService worldService;

    @GetMapping("/cities/{countryCode}")
    public List<City> getCities(@PathVariable("countryCode") String countryCode){
        return worldService.getCities(countryCode);
    }
}
