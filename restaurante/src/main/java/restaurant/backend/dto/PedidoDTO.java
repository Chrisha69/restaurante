package restaurant.backend.dto;

import java.io.Serializable;
import java.util.Calendar;

import lombok.Data;

@Data
public class PedidoDTO implements Serializable{

	private static final long serialVersionUID = 1L;
	
	private int id;
	
	private boolean estado;
	
	private Calendar fecha;
	
	private double total;
	
	private String observacion;
	
	private MesaDTO mesa;
	
	private ClienteDTO cliente;
	
	private EmpleadoDTO empleado;
	
}
