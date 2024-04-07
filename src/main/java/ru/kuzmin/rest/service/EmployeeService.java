package ru.kuzmin.rest.service;

import jakarta.validation.Valid;
import ru.kuzmin.rest.dto.EmployeeDto;
import ru.kuzmin.rest.entity.Employee;

import java.util.Optional;

public interface EmployeeService {
    Optional<Employee> getById(Integer id);
    Employee addEmployee(@Valid EmployeeDto edto);
}
