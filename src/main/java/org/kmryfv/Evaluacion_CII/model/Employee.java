package org.kmryfv.Evaluacion_CII.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Getter
@Setter
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_employee;

    @Column(length = 50, nullable = false)
    private String name;
    @Column(length = 50, nullable = false)
    private String surname;

    @Column(nullable = false)
    private LocalDate entryDate;

    @Column(nullable = false)
    private String role;

    @Column(length = 50, nullable = false, unique = true)
    private String email;
}
