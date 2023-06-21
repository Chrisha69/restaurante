package restaurant.backend.dto;

import java.io.Serializable;

import lombok.Data;

@Data
public class ClienteDTO implements Serializable{

	private static final long serialVersionUID = 1L;
	
	private int id;
	
	private PersonaDTO persona;
}