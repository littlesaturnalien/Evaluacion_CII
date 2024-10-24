package org.kmryfv.Evaluacion_CII.model;

import lombok.Getter;
import lombok.Setter;
import org.openxava.annotations.Stereotype;

import javax.persistence.*;
import java.util.Date;

@Embeddable
@Getter
@Setter
public class Advance {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @ManyToOne
    private Task task;

    @Stereotype("DATE")
    private Date fecha;

    @Stereotype("MEMO")
    private String comentario;
}
