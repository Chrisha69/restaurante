package restaurant.backend.domain;

import java.util.Calendar;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Data;

@Data
@Entity
public class Pedido {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column
	private int id;
	
	@Column
	private boolean estado;
	
	@Column
	private Calendar fecha;
	
	@Column
	private double total;
	
	@Column
	private String observacion;
	
	@ManyToOne
	@JoinColumn(name = "mesa_id")
	private Mesa mesa;
	
	@ManyToOne
	@JoinColumn(name = "cliente_id")
	private Cliente cliente;
	
	@ManyToOne
	@JoinColumn(name = "empleado_id")
	private Empleado empleado;
	
}
