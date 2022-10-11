package com.tuempresa.facturacion.modelo;

import javax.persistence.*;

import org.openxava.annotations.*;

@Entity
@View(extendsView="super.DEFAULT",
members="factura { factura } " 
)


public class Pedido extends DocumentoComercial {
	
	
	  @ManyToOne
	    @ReferenceView("SinClienteNiPedidos")
	    private Factura factura;
    


}