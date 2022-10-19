package com.tuempresa.facturacion.modelo;

import javax.persistence.*;

import lombok.*;

 
@Entity @Getter @Setter
public class Categoria extends Identificable { // Extiende de Identificable
                        // por tanto no necesita tener una propiedad id
    @Column(length=50)
    String descripcion;
  
}