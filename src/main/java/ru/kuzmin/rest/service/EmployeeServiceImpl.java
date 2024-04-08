package ru.kuzmin.rest.service;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.validation.annotation.Validated;
import ru.kuzmin.rest.repo.MyRepoDep;
import ru.kuzmin.rest.repo.MyRepoEmpl;
import ru.kuzmin.rest.dto.EmployeeDto;
import ru.kuzmin.rest.entity.Employee;

import java.util.Optional;

@RequiredArgsConstructor
@Service
@Validated
public class EmployeeServiceImpl implements EmployeeService {
    @Autowired
    private final MyRepoEmpl myRepoEmpl;




    @Override
    public Optional<Employee> getById(Integer id) {
        return Optional.of(myRepoEmpl.getById(id));
    }

    @Override
    public Employee addEmployee (EmployeeDto edto) {
        var empl = new Employee(edto.name(), edto.department());
        return myRepoEmpl.save(empl);
    }
}
