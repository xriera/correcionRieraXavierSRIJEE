package ec.edu.ups.correcionRieraXavierSRIJEE.service;

import ec.edu.ups.correcionRieraXavierSRIJEE.modelo.ClienteFactura;
import ec.edu.ups.correcionRieraXavierSRIJEE.modelo.RecargaFactura;

public class Parametros {
	  private ClienteFactura cliente;
	  private RecargaFactura recarga;

	    public ClienteFactura getCliente() {
	        return cliente;
	    }

	    public void setCliente(ClienteFactura cliente) {
	        this.cliente = cliente;
	    }

	    public RecargaFactura getRecarga() {
	        return recarga;
	    }

	    public void setRecarga(RecargaFactura recarga) {
	        this.recarga = recarga;
	    }
}
