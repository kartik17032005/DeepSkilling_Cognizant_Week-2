package com.cognizant.deepskilling_week_2.EmployeeManagementSystem.controllers;

import com.cognizant.deepskilling_week_2.EmployeeManagementSystem.entitites.EmployeeEntity;
import com.cognizant.deepskilling_week_2.EmployeeManagementSystem.services.EmployeeService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class EmployeeController {
    private EmployeeService employeeService;

    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @GetMapping("/employees")
    public Page<EmployeeEntity> getEmployees(

            @RequestParam(defaultValue = "0") int page,

            @RequestParam(defaultValue = "5") int size,

            @RequestParam(defaultValue = "name") String sortBy){

        return employeeService.getEmployees(page,size,sortBy);

    }

    @GetMapping("/employee/{id}")
    public Optional<EmployeeEntity> getEmployeeById(@PathVariable int id){
        return employeeService.getEmployeeById(id);
    }


    @PostMapping("/")
    public void createEmployee(EmployeeEntity employee){
        employeeService.createEmployee(employee);
    }

    @DeleteMapping("/employee/{id}")
    public void deleteEmployee(@PathVariable int id){
        employeeService.deleteEmployee(id);
    }
}
