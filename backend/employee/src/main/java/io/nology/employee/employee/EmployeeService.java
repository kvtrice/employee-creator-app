package io.nology.employee.employee;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import jakarta.validation.Valid;

@Service
public class EmployeeService {

    @Autowired
    private EmployeeRepository repo;

    public Employee createEmployee(@Valid CreateEmployeeDTO employeeData) {
        Employee employee = new Employee();
        employee.setFirstName(employeeData.getFirstName());
        employee.setLastName(employeeData.getLastName());
        employee.setEmail(employeeData.getEmail());
        employee.setMiddleName(employeeData.getMiddleName());
        employee.setMobile(employeeData.getMobile());
        employee.setAddressLine1(employeeData.getAddressLine1());

        if (employeeData.getAddressLine2() != null) {
            employee.setAddressLine2(employeeData.getAddressLine2());
        }

        employee.setSuburb(employeeData.getSuburb());
        employee.setState(employeeData.getState());
        employee.setPostcode(employeeData.getPostcode());
        employee.setIsPermanent(employeeData.getIsPermanent());

        return this.repo.save(employee);
    }

    public List<Employee> getAllEmployees() {
        return this.repo.findAll();
    }

    public Optional<Employee> getEmployeeById(Long id) {
        return this.repo.findById(id);
    }

}
