package restaurant.backend.dto;


import java.io.Serializable;

import lombok.Data;

@Data
public class MesaDTO implements Serializable{

	private static final long serialVersionUID = 1L;
	
	private int id;
	
	private int num_mesa;
	
	private boolean estado;
	
	private SeccionDTO seccion;

}
