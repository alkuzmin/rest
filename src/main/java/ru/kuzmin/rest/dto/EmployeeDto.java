package ru.kuzmin.rest.dto;

import jakarta.validation.constraints.NotBlank;
import ru.kuzmin.rest.entity.Department;

public record EmployeeDto(
        @NotBlank(message = "Не должен быть пустым")
        Integer id,
        @NotBlank(message = "Не должен быть пустым")
        String name,
        Department department
) {
}
