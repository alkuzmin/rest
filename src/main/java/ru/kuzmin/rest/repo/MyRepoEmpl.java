package ru.kuzmin.rest.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.kuzmin.rest.entity.Employee;

import java.util.Optional;

public interface MyRepoEmpl extends JpaRepository<Employee, Integer> {
    Optional<Employee> findByNumber(String number);
}
