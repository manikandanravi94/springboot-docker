package com.mani.dockerspringboot.controller;

import com.mani.dockerspringboot.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @Autowired
    EmployeeService service;


    @GetMapping("/evaluate")
    public String checkControllerRun(){
        return "Docker-springboot-container-runs";
    }

    @GetMapping("/getEmployeeName")
    public String getNames(){
        return service.getEmployeeName();
    }

}
