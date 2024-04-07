package ru.kuzmin.rest.service;

import jakarta.validation.Valid;
import ru.kuzmin.rest.dto.DepartmentDto;
import ru.kuzmin.rest.entity.Department;

import java.util.Optional;

public interface DepartmentService {
    Optional<Department> getById(Integer id);
    Department addDepartment(@Valid DepartmentDto ddto);
}
