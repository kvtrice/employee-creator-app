package io.nology.employee.employee;

import org.hibernate.validator.constraints.Length;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public class CreateEmployeeDTO {
    @NotBlank
    @Length(min = 2, max = 50)
    private String firstName;

    private String middleName;

    @NotNull
    @Length(min = 2, max = 50)
    private String lastName;

    @NotNull
    private String email;

    @NotNull
    private String mobileNumber;

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getEmail() {
        return email;
    }

    public String getMobileNumber() {
        return mobileNumber;
    }

    public String getMiddleName() {
        return middleName;
    }
}
