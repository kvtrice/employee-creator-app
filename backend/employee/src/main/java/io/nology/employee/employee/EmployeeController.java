package io.nology.employee.employee;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.nology.employee.common.exceptions.NotFoundException;
import jakarta.validation.Valid;
import java.util.List;
import java.util.Optional;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;

@RestController
@RequestMapping("employees")
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @PostMapping
    public ResponseEntity<Employee> createEmployee(@Valid @RequestBody CreateOrUpdateEmployeeDTO employeeData) {
        Employee createdEmployee = this.employeeService.createEmployee(employeeData);
        return new ResponseEntity<Employee>(createdEmployee, HttpStatus.CREATED);
    }

    @GetMapping
    public ResponseEntity<List<Employee>> getAllEmployees() {
        List<Employee> employees = this.employeeService.getAllEmployees();
        return new ResponseEntity<List<Employee>>(employees, HttpStatus.OK);
    }

    @GetMapping("{id}")
    public ResponseEntity<Employee> getEmployeeById(@PathVariable Long id) throws Exception {
        Optional<Employee> result = this.employeeService.getEmployeeById(id);

        Employee foundEmployee = result
                .orElseThrow(() -> new NotFoundException("Employee not found"));

        return new ResponseEntity<Employee>(foundEmployee, HttpStatus.OK);
    }

    @PatchMapping("/{id}")
    public ResponseEntity<Employee> updateEmployeeById(@PathVariable Long id,
            @Valid @RequestBody CreateOrUpdateEmployeeDTO employeeData) throws Exception {
        Optional<Employee> result = this.employeeService.updateEmployeeById(id, employeeData);

        Employee foundEmployee = result
                .orElseThrow(() -> new NotFoundException("Could not find employee with id " + id));

        return new ResponseEntity<Employee>(foundEmployee, HttpStatus.OK);
    }

}
