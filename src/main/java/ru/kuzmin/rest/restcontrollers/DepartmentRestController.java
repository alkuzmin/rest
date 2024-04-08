package ru.kuzmin.rest.restcontrollers;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import ru.kuzmin.rest.dto.DepartmentDto;
import ru.kuzmin.rest.service.DepartmentService;

import java.util.Optional;

@RestController
@RequestMapping("/departments/")
public class DepartmentRestController {
    @Autowired
    private final DepartmentService departmentService;

    @Autowired
    public DepartmentRestController(DepartmentService departmentService) {
        this.departmentService = departmentService;
    }

    @PostMapping
    public ResponseEntity<DepartmentDto> createDepartment(@Valid @RequestBody DepartmentDto ddto){

        var depreg = departmentService.addDepartment(ddto);
        //var responceDto = new ProductRegisterDataResponceDto(new ProductRegisterResponceDto(String.valueOf(depreg.getId())));
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<DepartmentDto> getDepartmentById (@PathVariable(name = "id") Integer id)
    {
        var dep = departmentService.getById(id);
        DepartmentDto ddto = new DepartmentDto(id,
           dep.get().getName(), dep.get().getAddress(),null);

    return new ResponseEntity<DepartmentDto>(ddto, HttpStatus.OK);
    }
}
