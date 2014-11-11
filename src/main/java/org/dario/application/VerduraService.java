package org.dario.application;

import java.net.URI;
import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.UriInfo;

import org.dario.entities.Verdura;

@Stateless
public class VerduraService {
	
	
	@PersistenceContext(unitName = "verdura-pu")
    private EntityManager entityManager;
	
	@Context
	private UriInfo uriInfo;
	
	public List<Verdura> obtenerTodasLasVerduras(){		
		TypedQuery<Verdura> query = entityManager.createNamedQuery(Verdura.FIND_ALL,Verdura.class);
		return query.getResultList();					
	}
	
	public Response guardar(Verdura verdura){
		entityManager.persist(verdura);
	    URI bookUri = uriInfo.getAbsolutePathBuilder().path(Long.toString(verdura.getId())).build();
	    return Response.created(bookUri).build();
	}
	

}
