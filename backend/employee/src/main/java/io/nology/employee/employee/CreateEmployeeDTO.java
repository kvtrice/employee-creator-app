package io.nology.employee.employee;

import java.time.LocalDate;

import org.hibernate.validator.constraints.Length;

import com.fasterxml.jackson.annotation.JsonFormat;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;

public class CreateEmployeeDTO {
    @NotBlank
    @Length(min = 2, max = 50)
    private String firstName;

    private String middleName = null;

    @NotNull
    @Length(min = 2, max = 50)
    private String lastName;

    @NotNull
    private String email;

    @NotNull
    private String mobile;

    @NotBlank
    private String addressLine1;

    private String addressLine2 = null;

    @NotBlank
    private String suburb;

    @NotNull
    private AddressStateCode state;

    @NotBlank
    @Pattern(regexp = "^[0-9]{4}$")
    private String postcode;

    @NotNull
    private Boolean isPermanent;

    @NotNull
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd-MM-yyyy")
    private LocalDate startDate;

    public LocalDate getStartDate() {
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

    public AddressStateCode getState() {
        return state;
    }

    public String getPostcode() {
        return postcode;
    }

    public Boolean getIsPermanent() {
        return isPermanent;
    }

}
