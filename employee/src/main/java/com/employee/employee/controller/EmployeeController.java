package com.employee.employee.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.LinkedList;

@RestController
@RequestMapping("/v1")
@CrossOrigin("*")
public class EmployeeController {

    @GetMapping("/employees")
    public ResponseEntity getEmployees(){

        return ResponseEntity.ok(Arrays.asList(new Employee(1,"ramu",10000),new Employee(2,"ram",10001),new Employee(3,"ramu",10000)));
    }
}
