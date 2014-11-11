package org.dario.application.rest;

import java.util.List;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.dario.application.VerduraService;
import org.dario.entities.Verdura;


@Path("verduras")
public class VerduraRESTService {
	
	
	@Inject
	VerduraService verdurasService;
	
	
	@GET
	@Path("lista")
	@Produces(MediaType.APPLICATION_JSON)
	public List<Verdura> obtenerTodasLasVerduras(){
	 return verdurasService.obtenerTodasLasVerduras(); 			
	}
	
	
	//curl -X POST --data-binary "verdura:{\"nombre\":\"Lechuga\",\"description\":\"la lechuga sirve para ensaladas\",\"precioUnitario\": 20.12}" -H "Content-Type: application/json" http://localhost:8080/Verduleria/api/verduras/guardar -v
	@POST
	@Path("guardar")	
	public Response guardar(Verdura verdura){
			return verdurasService.guardar(verdura);
	}
	
	
	
	

}
