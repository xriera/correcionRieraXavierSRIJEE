package ec.edu.ups.correcionRieraXavierSRIJEE.negocio;

import java.util.List;

import javax.ejb.Stateless;
import javax.inject.Inject;

import ec.edu.ups.correcionRieraXavierSRIJEE.dao.DaoGestion;
import ec.edu.ups.correcionRieraXavierSRIJEE.modelo.RecargaFactura;

@Stateless
public class ONGestion {
    @Inject
    private DaoGestion daog;
    
     public void crearRecarga(RecargaFactura rfac){
         daog.crearRecarga(rfac);
     }
     
     

}
