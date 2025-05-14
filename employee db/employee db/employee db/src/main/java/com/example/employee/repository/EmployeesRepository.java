package com.example.employee.repository;

import com.example.employee.model.Employees;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface EmployeesRepository extends MongoRepository<Employees, String> {
}
