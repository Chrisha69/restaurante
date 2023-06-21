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
public class Reserva {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column
	private int id;
	
	@Column
	private String observaciones;
	
	@Column
	private Calendar fecha;
	
	@Column
	private int persona;
	
	@ManyToOne
	@JoinColumn(name = "mesa_id")
	private Mesa mesa;
}
