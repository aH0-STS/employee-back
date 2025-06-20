package com.tushar.demo.entity;

import java.util.Date;

import javax.persistence.*;

import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;

import lombok.*;

@Entity
@Table(name = "employee")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Employee {

    private static final String DATE_PATTERN = "dd-MM-yyyy";

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int empId;

    @Column(name = "name")
    private String empName;

    @Column(name = "phone_number")
    private long empPhoneNumber;

    @Column(name = "email")
    private String empEmail;

    @Column(name = "joining_date")
    @Temporal(TemporalType.DATE)
    @JsonFormat(pattern = DATE_PATTERN)
    @DateTimeFormat(pattern = DATE_PATTERN)
    private Date joinDate;

    @Column(name = "username")
    private String username;

    @Column(name = "password")
    private String password;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "address_id", referencedColumnName = "id")
    private Address empAddress;
}

