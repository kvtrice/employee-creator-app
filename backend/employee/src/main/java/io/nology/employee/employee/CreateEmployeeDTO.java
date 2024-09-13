package io.nology.employee.employee;

import java.util.Date;

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
    private String mobile;

    @NotBlank
    private String addressLine1;

    private String addressLine2;

    @NotBlank
    private String suburb;

    @NotBlank
    private String state;

    @NotBlank
    private String postcode;

    @NotBlank
    private boolean isPermanent;

    @NotBlank
    private Date startDate;

    public Date getStartDate() {
        return startDate;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getEmail() {
        return email;
    }

    public String getMobile() {
        return mobile;
    }

    public String getAddressLine1() {
        return addressLine1;
    }

    public String getAddressLine2() {
        return addressLine2;
    }

    public String getSuburb() {
        return suburb;
    }

    public String getState() {
        return state;
    }

    public String getPostcode() {
        return postcode;
    }

    public boolean getIsPermanent() {
        return isPermanent;
    }   

}
