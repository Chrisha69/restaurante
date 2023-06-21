package restaurant.backend.dto;

import java.io.Serializable;

import lombok.Data;

@Data
public class UsuarioDTO implements Serializable{

	private static final long serialVersionUID = 1L;
	
	private int id;
	
	private String username;
	
	private String email;
	
	private String password;	
	
	private EmpleadoDTO empleado;
}
