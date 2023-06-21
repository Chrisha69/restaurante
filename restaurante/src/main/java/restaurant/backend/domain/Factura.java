package restaurant.backend.domain;

import java.util.Calendar;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import lombok.Data;

@Data
@Entity
public class Factura {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column
	private int id;
	
	@Column
	private Calendar fecha;
	
	@Column
	private double iva;
	
	@Column
	private double descuento;
	
	@Column
	private double total;
	
	@OneToOne
	@JoinColumn(name = "pedido_id")
	private Pedido pedido;
}
