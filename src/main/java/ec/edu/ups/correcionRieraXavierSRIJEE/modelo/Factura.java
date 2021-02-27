package ec.edu.ups.correcionRieraXavierSRIJEE.modelo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Factura {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idfact;

    private double valor;


    @OneToOne(mappedBy = "factura")
    @JsonIgnore
    private RecargaFactura recarga;


	public int getIdfact() {
		return idfact;
	}


	public void setIdfact(int idfact) {
		this.idfact = idfact;
	}


	public double getValor() {
		return valor;
	}


	public void setValor(double valor) {
		this.valor = valor;
	}


	public RecargaFactura getRecarga() {
		return recarga;
	}


	public void setRecarga(RecargaFactura recarga) {
		this.recarga = recarga;
	}
    
}
