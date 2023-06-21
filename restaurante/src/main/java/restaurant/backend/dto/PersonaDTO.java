package restaurant.backend.dto;

import java.io.Serializable;

import lombok.Data;

@Data
public class PersonaDTO implements Serializable{

	private static final long serialVersionUID = 1L;
	
	private int id;
	
	private String nombre;
	
	private String apellido;
	
	private String telefono;
	
	private String email;
	
	private String cedula;
	
	private String direccion;
}
