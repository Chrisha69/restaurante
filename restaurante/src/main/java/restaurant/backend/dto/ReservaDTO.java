package restaurant.backend.dto;

import java.io.Serializable;
import java.util.Calendar;
import lombok.Data;

@Data
public class ReservaDTO implements Serializable{

	private static final long serialVersionUID = 1L;
	
	private int id;
	
	private String observaciones;
	
	private Calendar fecha;
	
	private int persona;
	
	private MesaDTO mesa;
}
