package com.cognizant.deepskilling_week_2.EmployeeManagementSystem.entitites;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "department_table")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class DepartmentEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "department_id")
    private int id;

    @Column(name = "department_name")
    private String name;
}
