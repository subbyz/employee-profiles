package com.n2s.j2ee.employeeprofiles.controllers;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class EmployeeProfilesTest {

    @Autowired
    EmployeeProfiles employeeProfiles;

    @Test
    public void testGetAllEmployees() {
        List<String> empTest = employeeProfiles.getAllEmployees();
        assertTrue( empTest.get(0).contains( "Jack" ) );
    }
}