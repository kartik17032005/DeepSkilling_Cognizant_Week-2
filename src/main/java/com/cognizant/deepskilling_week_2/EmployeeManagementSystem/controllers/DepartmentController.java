package com.cognizant.deepskilling_week_2.EmployeeManagementSystem.controllers;

import com.cognizant.deepskilling_week_2.EmployeeManagementSystem.entitites.DepartmentEntity;
import com.cognizant.deepskilling_week_2.EmployeeManagementSystem.services.DepartmentService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class DepartmentController {
    private DepartmentService departmentService;

    public DepartmentController(DepartmentService departmentService) {
        this.departmentService = departmentService;
    }

    @GetMapping("/")
    public List<DepartmentEntity> getAllDepartments(){
        return departmentService.getAllDepartment();
    }

    @GetMapping("/department/{id}")
    public Optional<DepartmentEntity> getDepartmentById(@PathVariable int id){
        return departmentService.getDepartmentById(id);
    }

    @PostMapping("/")
    public void createDepartment(DepartmentEntity department){
        departmentService.createDepartment(department);
    }

    @DeleteMapping("/department/{id}")
    public void deleteDepartmentById(@PathVariable int id){
        departmentService.deleteDepartment(id);
    }

}
