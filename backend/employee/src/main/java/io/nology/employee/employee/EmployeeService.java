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

    public Employee createEmployee(@Valid CreateOrUpdateEmployeeDTO employeeData) {
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

    public Optional<Employee> updateEmployeeById(Long id, @Valid CreateOrUpdateEmployeeDTO employeeData) {
        Optional<Employee> employee = this.getEmployeeById(id);
        if (employee.isEmpty()) {
            return employee;
        }

        Employee foundEmployee = employee.get();

        if (employeeData.getFirstName() != null) {
            foundEmployee.setFirstName(employeeData.getFirstName());
        }

        if (employeeData.getMiddleName() != null) {
            foundEmployee.setMiddleName(employeeData.getMiddleName());
        }

        if (employeeData.getLastName() != null) {
            foundEmployee.setLastName(employeeData.getLastName());
        }

        if (employeeData.getEmail() != null) {
            foundEmployee.setEmail(employeeData.getEmail());
        }

        if (employeeData.getMobile() != null) {
            foundEmployee.setMobile(employeeData.getMobile());
        }

        if (employeeData.getAddressLine1() != null) {
            foundEmployee.setAddressLine1(employeeData.getAddressLine1());
        }

        if (employeeData.getAddressLine2() != null) {
            foundEmployee.setAddressLine2(employeeData.getAddressLine2());
        }

        if (employeeData.getSuburb() != null) {
            foundEmployee.setSuburb(employeeData.getSuburb());
        }

        if (employeeData.getState() != null) {
            foundEmployee.setState(employeeData.getState());
        }

        if (employeeData.getPostcode() != null) {
            foundEmployee.setPostcode(employeeData.getPostcode());
        }

        if (employeeData.getIsPermanent()) {
            foundEmployee.setIsPermanent(employeeData.getIsPermanent());
        }

        if (employeeData.getStartDate() != null) {
            foundEmployee.setStartDate(employeeData.getStartDate());
        }

        return Optional.of(this.repo.save(foundEmployee));
    }

}
