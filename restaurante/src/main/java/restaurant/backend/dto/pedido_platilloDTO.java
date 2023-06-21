package restaurant.backend.dto;

import java.io.Serializable;

import lombok.Data;

@Data
public class pedido_platilloDTO implements Serializable{

	private static final long serialVersionUID = 1L;
	
	private int id;
	
	private int cantidad;
	
	private double precioUnitario;
	
	private PedidoDTO pedido;
	
	private PlatilloDTO platillo;
	
	private ProductoDTO producto;
	
}
