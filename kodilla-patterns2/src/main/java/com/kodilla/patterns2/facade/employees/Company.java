package com.kodilla.patterns2.facade.employees;

import lombok.Getter;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by Marcin Muller on 26.10.17.
 */

@NamedQuery(
        name = "Company.retrieveName",
        query = "FROM Company WHERE name like :LASTNAME"
)


@Getter
@Entity
@Table(name="company")
public class Company {
    @NotNull
    @Id
    @GeneratedValue
    @Column(name="company_id", unique = true)
    private int id;
    @Column(name = "name")
    private String name;

    @Column(name = "employees")
    @ManyToMany(cascade = CascadeType.ALL, mappedBy = "companies")
    private Set<Employee> employees = new HashSet<>();

    public Company() {
    }

    public Company(String name) {
        this.name = name;
    }
}
