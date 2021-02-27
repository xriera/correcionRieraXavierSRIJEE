package ec.edu.ups.correcionRieraXavierSRIJEE.modelo;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class ClienteFactura {
	   @Id
	   @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private int idFactura;
	   
	    private String cedula;

	    private String nombre;
	    private String numeroCeular;
	    private double saldo;
	    
	    @JsonIgnore
	    @OneToMany( mappedBy = "clientefactura")
	    private List<RecargaFactura> recarga;

	    
		public int getIdFactura() {
			return idFactura;
		}

		public void setIdFactura(int idFactura) {
			this.idFactura = idFactura;
		}

		public String getCedula() {
			return cedula;
		}

		public void setCedula(String cedula) {
			this.cedula = cedula;
		}

		public String getNombre() {
			return nombre;
		}

		public void setNombre(String nombre) {
			this.nombre = nombre;
		}

		public String getNumeroCeular() {
			return numeroCeular;
		}

		public void setNumeroCeular(String numeroCeular) {
			this.numeroCeular = numeroCeular;
		}

		public double getSaldo() {
			return saldo;
		}

		public void setSaldo(double saldo) {
			this.saldo = saldo;
		}

		public List<RecargaFactura> getRecarga() {
			return recarga;
		}

		public void setRecarga(List<RecargaFactura> recarga) {
			this.recarga = recarga;
		}
	    
	    
}
