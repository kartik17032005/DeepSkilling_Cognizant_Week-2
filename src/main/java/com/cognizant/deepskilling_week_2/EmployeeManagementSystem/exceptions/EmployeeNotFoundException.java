package com.cognizant.deepskilling_week_2.EmployeeManagementSystem.exceptions;

public class EmployeeNotFoundException extends RuntimeException{
    public EmployeeNotFoundException(){
        super("Employee not found");
    }
}
