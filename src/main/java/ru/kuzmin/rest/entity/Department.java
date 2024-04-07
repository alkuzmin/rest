package ru.kuzmin.rest.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "Departments")
@AllArgsConstructor
@NoArgsConstructor
public class Department {
    public Department(String name, String address){
        this.name = name;
        this.address = address;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer id;
    @Getter
    @Setter
    @Column(name = "name")
    String name;
    @Getter
    @Setter
    @Column(name = "address")
    String address;


    @Getter //!!!!
    @Setter //!!!!
    @OneToMany(mappedBy = "department", cascade = CascadeType.ALL, orphanRemoval = true)
    Set<Employee> employeeSet = new HashSet<Employee>();


    @Override
    public String toString()
    {
        return name+ " "+address;
    }

}
