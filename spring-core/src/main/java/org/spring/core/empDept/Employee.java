package org.spring.core.empDept;

import lombok.*;

import java.util.Date;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Employee {

    private int empID;
    private String empName;
    private Date dob;

}
