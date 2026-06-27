package com.cognizant.deepskilling_week_2.springDataJpaWithHibernate.services;

import com.cognizant.deepskilling_week_2.springDataJpaWithHibernate.entities.Department;
import com.cognizant.deepskilling_week_2.springDataJpaWithHibernate.entities.Employee;
import com.cognizant.deepskilling_week_2.springDataJpaWithHibernate.repositories.EmployeeRepository;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class EmployeeService {
    private EmployeeRepository employeeRepository;

    public EmployeeService(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    @Transactional
    public Optional<Employee> getEmployeeById(int id){
        return employeeRepository.findById(id);
    }

    @Transactional
    public void addEmployee(Employee employee){
        employeeRepository.save(employee);
    }


}
