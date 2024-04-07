package ru.kuzmin.rest.repo;

import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import ru.kuzmin.rest.entity.Department;

public interface MyRepoDep extends JpaRepository<Department, Integer> {
    //List<Department> findAllByName(String name);

    @Modifying
    @Transactional
    @Query(value = "UPDATE departments SET name = :name WHERE id = :id", nativeQuery = true)
    int updateDepartmentsSetNameForIdNative(@Param("name") String Name, @Param("id") Integer id);

    @Modifying
    @Transactional
    @Query(value = "INSERT INTO Departments (name, address) VALUES (?1, ?2)", nativeQuery = true)
    int insertDepartment(String name, String address);

}



