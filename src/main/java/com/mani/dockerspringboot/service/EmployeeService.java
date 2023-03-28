package com.mani.dockerspringboot.service;

import org.springframework.stereotype.Service;

@Service
public class EmployeeService {

    public String getEmployeeName(){
        return "Test-name controller";
    }
}
