package org.cash.secondcutexam.modelo;

import java.util.*;

import javax.persistence.*;

import org.openxava.annotations.*;

public class Tarea {
	@Id @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @ManyToOne @DescriptionsList
    private Proyecto proyecto;

    @ManyToOne @DescriptionsList
    private Empleado empleado;

    @Column(length = 30)
    private String nombre;

    @Stereotype("MEMO")
    private String descripcion;

    @Stereotype("DATE")
    private Date fechaLimite;

    @Column(length = 30)
    private String estado;

    @OneToMany(mappedBy = "tarea")
    @ListProperties("fecha, comentarios")
    private Collection<Avance> avances;
}
