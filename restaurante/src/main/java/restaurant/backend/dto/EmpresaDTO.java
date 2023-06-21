package restaurant.backend.dto;

import java.io.Serializable;

import lombok.Data;

@Data
public class EmpresaDTO implements Serializable{

	private static final long serialVersionUID = 1L;
	
	private int id;

	private String razon_social;
	
	private String nombre;
	
	private String ruc;
	
	private String telefono;
	
	private String direccion;
	
}
