package restaurant.backend.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public class Platillo {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column
	private int id;
	
	@Column
	private String nombre;
	
	@Column
	private String categoria;
	
	@Column
	private double precio;
	
	@Column
	private double costo;
	
	@Column
	private boolean disponibilidad;
	
	@Column	
	private String ingredientes;

}
