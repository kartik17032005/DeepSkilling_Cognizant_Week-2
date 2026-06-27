package com.cognizant.deepskilling_week_2;

import com.cognizant.deepskilling_week_2.springDataJpaWithHibernate.entities.Department;
import com.cognizant.deepskilling_week_2.springDataJpaWithHibernate.entities.Employee;
import com.cognizant.deepskilling_week_2.springDataJpaWithHibernate.entities.Skill;
import com.cognizant.deepskilling_week_2.springDataJpaWithHibernate.repositories.DepartmentRepository;
import com.cognizant.deepskilling_week_2.springDataJpaWithHibernate.repositories.EmployeeRepository;
import com.cognizant.deepskilling_week_2.springDataJpaWithHibernate.services.EmployeeService;
import jakarta.transaction.Transactional;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDate;
import java.util.Optional;

@Slf4j
@SpringBootTest
public class testEmployee {

    @Autowired
    private EmployeeService employeeService;

    @Autowired
    private DepartmentRepository departmentRepository;

    @Test
    public void testGetEmployee(){
        log.info("Start");
        Optional<Employee> employee = employeeService.getEmployeeById(1);
        log.info("Employee: {} ", employee);
        log.info("end");
    }

    @Test
    public void addEmployee() {
        Department department = departmentRepository.findById(1).get();

        Employee employee = new Employee();
        employee.setName("Ankur");
        employee.setSalary(60000);
        employee.setPermanent(true);
        employee.setDateOfBirth(LocalDate.of(2025, 9, 10));
        employee.setDepartment(department);

        employeeService.addEmployee(employee);
    }

//    @Test
//    @Transactional
//    public void testAddSkillToEmployee(){
//
//        Employee employee =
//                employeeService.getEmployeeById(1);
//
//        Skill skill =
//                skillService.getSkillById(3);
//
//        employee.getSkillList().add(skill);
//
//        employeeService.save(employee);
//
//    }

}
