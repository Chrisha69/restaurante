package restaurant.backend.dto;

import java.io.Serializable;
import java.util.Calendar;

import lombok.Data;

@Data
public class FacturaDTO implements Serializable{

	private static final long serialVersionUID = 1L;
	
	private int id;
	
	private Calendar fecha;
	
	private double iva;
	
	private double descuento;
	
	private double total;
	
	private PedidoDTO pedido;
}
