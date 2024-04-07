package ru.kuzmin.rest;

import jakarta.persistence.Column;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.validation.constraints.NotBlank;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.Cascade;

public record EmployeeDto(
        @NotBlank(message = "Не должен быть пустым")
        Integer id,
        @NotBlank(message = "Не должен быть пустым")
        String name,
        Department department
) {
}
