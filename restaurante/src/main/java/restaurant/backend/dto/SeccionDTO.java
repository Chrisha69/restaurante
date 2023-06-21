package restaurant.backend.dto;

import java.io.Serializable;

import lombok.Data;

@Data
public class SeccionDTO implements Serializable{

	private static final long serialVersionUID = 1L;
	
	private int id;
	
	private String nombre;
	
	private int capacidad;
	
	private String estado;
	
	private int mesa_disponible;
}
