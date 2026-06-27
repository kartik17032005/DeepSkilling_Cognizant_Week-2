package com.cognizant.deepskilling_week_2.EmployeeManagementSystem.services;

import com.cognizant.deepskilling_week_2.EmployeeManagementSystem.entitites.EmployeeEntity;
import com.cognizant.deepskilling_week_2.EmployeeManagementSystem.exceptions.EmployeeNotFoundException;
import com.cognizant.deepskilling_week_2.EmployeeManagementSystem.repositories.EmployeeRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeService {

    private EmployeeRepository employeeRepository;

    public EmployeeService(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    //get
    public Page<EmployeeEntity> getEmployees(
            int page,
            int size,
            String sortBy){

        Pageable pageable =
                PageRequest.of(
                        page,
                        size,
                        Sort.by(sortBy)
                );

        return employeeRepository.findAll(pageable);
    }

    //get by id
    public Optional<EmployeeEntity> getEmployeeById(int id){
        Optional<EmployeeEntity> employee = employeeRepository.findById(id);

        if(!employee.isPresent()){
            throw new EmployeeNotFoundException();
        }

        return employee;
    }

    //create
    public void createEmployee(EmployeeEntity employee){
        employeeRepository.save(employee);
    }

    //update
    public EmployeeEntity updateEmployee(int id, EmployeeEntity employee){
        Optional<EmployeeEntity> employeeEntity = employeeRepository.findById(id);

        if(employeeEntity.isPresent()){
            EmployeeEntity employee1 = employeeEntity.get();

            employee1.setName(employee1.getName());
            employee1.setEmail(employee1.getEmail());
            employee1.setDepartment(employee1.getDepartment());

            return employeeRepository.save(employee1);
        }

        throw new EmployeeNotFoundException();
    }

    //delete
    public void deleteEmployee(int id){
        employeeRepository.deleteById(id);
    }

}
