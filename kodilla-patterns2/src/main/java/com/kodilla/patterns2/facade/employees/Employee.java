package com.kodilla.patterns2.facade.employees;

import lombok.Getter;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by Marcin Muller on 26.10.17.
 */

@NamedQueries({
        @NamedQuery(
                name = "Employee.retrieveSurname",
                query = "FROM Employee WHERE surname like :LASTNAME"
        ),
        @NamedQuery(
                name = "Employee.retrieveName",
                query = "FROM Employee WHERE name like :LASTNAME"
        )
})

@Getter
@Entity
@Table(name="employee")
public class Employee {
    private String name;
    private String surname;
    @NotNull
    @Id
    @GeneratedValue
    @Column(name = "employee_id", unique = true)
    private int id;

    @Column(name="companies")
    @ManyToMany(cascade = CascadeType.ALL)
    private Set<Company> companies=new HashSet<>();

    public Employee(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public Employee() {
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Employee employee = (Employee) o;

        if (name != null ? !name.equals(employee.name) : employee.name != null) return false;
        return surname != null ? surname.equals(employee.surname) : employee.surname == null;
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + (surname != null ? surname.hashCode() : 0);
        return result;
    }
}
