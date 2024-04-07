package ru.kuzmin.rest;

import org.springframework.data.jpa.repository.JpaRepository;

public interface MyRepoEmpl extends JpaRepository<Employee, Integer> {
}
