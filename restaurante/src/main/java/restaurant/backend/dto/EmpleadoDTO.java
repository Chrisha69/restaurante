package restaurant.backend.dto;

import java.io.Serializable;

import lombok.Data;

@Data
public class EmpleadoDTO implements Serializable{

	private static final long serialVersionUID = 1L;
	
	private int id;
	
	private String cargo;
	
	private String especialidad;
	
	private PersonaDTO persona;

}
