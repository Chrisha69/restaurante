package restaurant.backend.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public class Empresa {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column
	private int id;

	@Column
	private String razon_social;
	
	@Column
	private String nombre;
	
	@Column
	private String ruc;
	
	@Column
	private String telefono;
	
	@Column
	private String direccion;
	
}
