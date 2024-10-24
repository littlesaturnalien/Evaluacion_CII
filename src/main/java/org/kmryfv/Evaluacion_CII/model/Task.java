package org.kmryfv.Evaluacion_CII.model;

import lombok.Getter;
import lombok.Setter;
import org.openxava.annotations.DescriptionsList;
import org.openxava.annotations.ListProperties;
import org.openxava.annotations.Stereotype;

import javax.persistence.*;
import java.util.Collection;
import java.util.Date;

@Embeddable
@Getter
@Setter
public class Task {
    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @ManyToOne @DescriptionsList
    private Project project;

    @ManyToOne
    @DescriptionsList
    private Employee employee;

    @Column(length = 30)
    private String name;

    @Stereotype("MEMO")
    private String description;

    @Stereotype("DATE")
    private Date fechaLimite;

    @Column(length = 30)
    private String estado;

    @OneToMany(mappedBy = "tarea")
    @ListProperties("fecha, comentarios")
    private Collection<Advance> advances;
}
