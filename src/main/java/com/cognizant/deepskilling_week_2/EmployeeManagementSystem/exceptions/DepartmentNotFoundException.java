package com.cognizant.deepskilling_week_2.EmployeeManagementSystem.exceptions;

public class DepartmentNotFoundException extends RuntimeException{
    public DepartmentNotFoundException(){
        super("Department not found");
    }
}
