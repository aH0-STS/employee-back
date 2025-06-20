package com.tushar.demo.entity;

import javax.persistence.*;

import lombok.*;

@Entity
@Table(name = "employee_address")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Address {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private long addId;

    @Column(name = "street")
    private String street;

    @Column(name = "city_name")
    private String cityName;

    @Column(name = "state_name")
    private String stateName;
}
