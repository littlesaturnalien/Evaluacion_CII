package org.cash.secondcutexam.modelo;

import java.util.*;

import javax.persistence.*;

import org.openxava.annotations.*;

import lombok.*;

@Entity @Getter @Setter
public class Proyecto {
    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(length = 30)
    private String nombre;

    @Stereotype("MEMO")
    private String descripcion;

    @Stereotype("DATE")
    private Date fechaInicio;

    @Stereotype("DATE")
    private Date fechaFin;

    @OneToMany(mappedBy="proyecto") @ListProperties("nombre, descripcion, estado, fechaLimite")
    private Collection<Tarea> tareas;
}
