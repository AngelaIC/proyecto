package edu.udea.main.controller;

import edu.udea.main.model.Employee;
import edu.udea.main.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class EmployeeController {
    @Autowired
    EmployeeService employeeService;

    @GetMapping("/employees")
    private void createdEmployee(@RequestBody Employee employee){
        employeeService.createdEmployee(employee);

    }
}




