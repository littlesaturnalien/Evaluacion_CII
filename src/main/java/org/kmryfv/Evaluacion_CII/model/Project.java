package org.kmryfv.Evaluacion_CII.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Getter
@Setter
public class Project {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_project;

    @Column(unique = true)
    private String name;
    private String description;
    private LocalDate start_date;
    private LocalDate end_date;
}
