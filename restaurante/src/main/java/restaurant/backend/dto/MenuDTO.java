package restaurant.backend.dto;


import java.io.Serializable;
import lombok.Data;

@Data
public class MenuDTO implements Serializable{

	private static final long serialVersionUID = 1L;
	
	private int id;
	
	private String nombre;
	
	private String descripcion;
	
	private PlatilloDTO platillo;

}
