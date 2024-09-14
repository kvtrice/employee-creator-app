package io.nology.employee.employee;

import java.time.LocalDate;

import jakarta.validation.constraints.Pattern;

public class UpdateEmployeeDTO {
    private String firstName;
    private String middleName;
    private String lastName;
    private String email;
    private String mobile;
    private String addressLine1;
    private String addressLine2;
    private String suburb;
    private AddressStateCode state;

    @Pattern(regexp = "^[0-9]{4}$")
    private String postcode;
    private Boolean isPermanent;
    private LocalDate startDate;

    public String getFirstName() {
        return firstName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public String getMiddleName() {
        return middleName;
    }
    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }
    public String getLastName() {
        return lastName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getMobile() {
        return mobile;
    }
    public void setMobile(String mobile) {
        this.mobile = mobile;
    }
    public String getAddressLine1() {
        return addressLine1;
    }
    public void setAddressLine1(String addressLine1) {
        this.addressLine1 = addressLine1;
    }
    public String getAddressLine2() {
        return addressLine2;
    }
    public void setAddressLine2(String addressLine2) {
        this.addressLine2 = addressLine2;
    }
    public String getSuburb() {
        return suburb;
    }
    public void setSuburb(String suburb) {
        this.suburb = suburb;
    }
    public AddressStateCode getState() {
        return state;
    }
    public void setState(AddressStateCode state) {
        this.state = state;
    }
    public String getPostcode() {
        return postcode;
    }
    public void setPostcode(String postcode) {
        this.postcode = postcode;
    }
    public Boolean getIsPermanent() {
        return isPermanent;
    }
    public void setIsPermanent(Boolean isPermanent) {
        this.isPermanent = isPermanent;
    }
    public LocalDate getStartDate() {
        return startDate;
    }
    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }
    
}
