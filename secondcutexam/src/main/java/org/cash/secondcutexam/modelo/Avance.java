package org.cash.secondcutexam.modelo;

import java.util.*;

import javax.persistence.*;

import org.openxava.annotations.*;

import lombok.*;

@Entity @Getter @Setter
public class Avance {
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @ManyToOne
    private Tarea tarea;

    @Stereotype("DATE")
    private Date fecha;

    @Stereotype("MEMO")
    private String comentario;
}
