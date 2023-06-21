package restaurant.backend.dto;

import java.io.Serializable;

import lombok.Data;

@Data
public class ProductoDTO implements Serializable{

	private static final long serialVersionUID = 1L;
	
	private int id;
	
	private String nombre;
	
	private String Caegoria;
	
	private double stock;
	
	private String descripcion;
	
	private double costo;
	
	private double precio;
	
	private ProveedorDTO proveedor;

}
