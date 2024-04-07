package ru.kuzmin.rest.dto;

import jakarta.persistence.Column;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

public record DepartmentDto(
        @NotBlank(message = "Не должен быть пустым")
        Integer id,
        @NotBlank(message = "Не должен быть пустым")
        String name,
        @Size(min = 0, max = 100)
        String address,
        List<Integer> employees
) {
}
