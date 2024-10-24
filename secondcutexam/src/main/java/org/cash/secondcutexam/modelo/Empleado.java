package org.cash.secondcutexam.modelo;

import java.util.*;

import javax.persistence.*;
import javax.persistence.Entity;

import org.hibernate.annotations.*;
import org.openxava.annotations.*;

import lombok.*;

@Entity @Getter @Setter
public class Empleado {
	
		@Id @Hidden
		@GeneratedValue(generator="system-uuid")
		@GenericGenerator(name="system-uuid", strategy= "uuid")
		@Column(length = 32)
		String oid;

	    @Column(length = 30)
	    private String nombres;

	    @Column(length = 30)
	    private String apellidos;

	    @Stereotype("DATE")
	    private Date fechaIngreso;

	    private String cargo;

	    @Stereotype("EMAIL")
	    private String email;

	    @OneToMany(mappedBy = "empleado")
	    private Collection<Tarea> tareas;
}
