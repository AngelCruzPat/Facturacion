package com.tuempresa.facturacion.modelo;
 
import java.time.*;

import javax.persistence.*;
import javax.persistence.Entity;

import org.hibernate.annotations.*;
import org.openxava.annotations.*;
import org.openxava.calculators.*;

import lombok.*;
 
@Entity @Getter @Setter
public class Factura {

    @Id
    @GeneratedValue(generator="system-uuid")
    @Hidden
    @GenericGenerator(name="system-uuid", strategy="uuid")
    @Column(length=32)
    String oid;
 
    @Column(length=4)
    @DefaultValueCalculator(CurrentYearCalculator.class)
    int anyo;
 
    @Column(length=6)
    int numero;
 
    @Required
    @DefaultValueCalculator(CurrentLocalDateCalculator.class)
    LocalDate fecha;
 
    @TextArea
    String observaciones;
 
}