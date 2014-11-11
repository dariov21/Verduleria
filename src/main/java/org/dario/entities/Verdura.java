package org.dario.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.xml.bind.annotation.XmlRootElement;

@Entity
@XmlRootElement
@NamedQuery(name = Verdura.FIND_ALL,query = "SELECT v FROM Verdura v")
public class Verdura {
	 public static final String FIND_ALL= "Verdura.findAll";
	 @Id
     @GeneratedValue(strategy = GenerationType.AUTO)
	 private long id;
     private String nombre;
     private String description;
     private double precioUnitario;
     
     
       
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public double getPrecioUnitario() {
		return precioUnitario;
	}
	public void setPrecioUnitario(double precioUnitario) {
		this.precioUnitario = precioUnitario;
	}
       
}
