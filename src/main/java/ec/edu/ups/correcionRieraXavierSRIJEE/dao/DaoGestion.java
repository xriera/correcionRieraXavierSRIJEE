package ec.edu.ups.correcionRieraXavierSRIJEE.dao;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import ec.edu.ups.correcionRieraXavierSRIJEE.modelo.RecargaFactura;


@Stateless
public class DaoGestion {
	   @PersistenceContext
	    private EntityManager em;
	    
	     public void crearRecarga(RecargaFactura rfac){
	         em.persist(rfac);
	     }
	     
	     

}
