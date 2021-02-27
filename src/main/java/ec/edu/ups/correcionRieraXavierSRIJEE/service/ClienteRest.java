package ec.edu.ups.correcionRieraXavierSRIJEE.service;

import java.io.IOException;

import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import ec.edu.ups.correcionRieraXavierSRIJEE.modelo.ClienteFactura;
import ec.edu.ups.correcionRieraXavierSRIJEE.modelo.Factura;
import ec.edu.ups.correcionRieraXavierSRIJEE.modelo.RecargaFactura;
import ec.edu.ups.correcionRieraXavierSRIJEE.negocio.ONGestion;

@Path("clientes")
public class ClienteRest {


    @Inject
    private ONGestion on;

    @POST
    @Path("/ingresar")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public Respuesta crearProducto2(Parametros p) throws IOException, Exception {
        Respuesta resp = new Respuesta();

        try {
        ClienteFactura clifac = p.getCliente();

        Factura f = new Factura();
        
        
        RecargaFactura recarga = p.getRecarga();
        recarga.setFactura(f);
        recarga.setClientefactura(clifac);
        
        f.setValor(recarga.getValor());
       
        
        resp.setCodigo(1);
		resp.setMensaje("registro factura");

        clifac.setSaldo(f.getValor());

        on.crearRecarga(recarga);
        

       
        } catch (Exception e) {
        	 resp.setCodigo(-1);
			 resp.setMensaje("ERROR recursos insuficientes en la cuenta fa ws");
			e.printStackTrace();
        }
         return resp;
    }
}
