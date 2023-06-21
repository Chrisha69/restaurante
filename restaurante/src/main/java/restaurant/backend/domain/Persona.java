package restaurant.backend.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public class Persona {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column
	private int id;
	
	@Column(length = 15, nullable = false)
	private String nombre;
	
	@Column(length = 15)
	private String apellido;
	
	@Column(length = 13)
	private String telefono;
	
	@Column(length = 30)
	private String email;
	
	@Column(length = 13, nullable = false)
	private String cedula;
	
	@Column(length = 70)
	private String direccion;
}
