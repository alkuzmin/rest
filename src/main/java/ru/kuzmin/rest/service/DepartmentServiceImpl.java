package ru.kuzmin.rest.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.validation.annotation.Validated;
import ru.kuzmin.rest.dto.DepartmentDto;
import ru.kuzmin.rest.entity.Department;
import ru.kuzmin.rest.entity.Employee;
import ru.kuzmin.rest.repo.MyRepoDep;
import ru.kuzmin.rest.repo.MyRepoEmpl;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.Optional;

@RequiredArgsConstructor
@Service
@Validated
public class DepartmentServiceImpl implements DepartmentService {
    @Autowired
    private final MyRepoDep myRepoDep;

    @Override
    public Optional<Department> getById(Integer id) {
        return Optional.of(myRepoDep.getById(id));
    }

    @Override
    public Department addDepartment(DepartmentDto ddto) {
        var dep = new Department(ddto.name(), ddto.address());
        return myRepoDep.save(dep);
    }
}
