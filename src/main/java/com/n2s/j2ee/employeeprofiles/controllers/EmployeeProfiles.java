package com.n2s.j2ee.employeeprofiles.controllers;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestController
public class EmployeeProfiles {

    @GetMapping( value = "/getAllEmployees", produces = MediaType.APPLICATION_JSON_VALUE )
    public List<String> getAllEmployees(){
          return new ArrayList<>( Arrays.asList("Jack","Erin","Ben"));
    }


}
