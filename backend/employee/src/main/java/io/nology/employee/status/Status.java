package io.nology.employee.status;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "employee_status")
public class Status {

    // Enum, Perm or Contract
    @Column
    private String contractType;

    @Column
    private String startDate;

    @Column
    private String endDate;

    // Enum, FT or PT
    @Column
    private String workLoad;

    @Column
    private String weeklyHours;
}
