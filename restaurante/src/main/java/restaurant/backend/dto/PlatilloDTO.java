package restaurant.backend.dto;

import java.io.Serializable;

import lombok.Data;

@Data
public class PlatilloDTO implements Serializable{

	private static final long serialVersionUID = 1L;
	
	private int id;
	
	private String nombre;
	
	private String categoria;
	
	private double precio;
	
	private double costo;
	
	private boolean disponibilidad;
	
	private String ingredientes;

}
