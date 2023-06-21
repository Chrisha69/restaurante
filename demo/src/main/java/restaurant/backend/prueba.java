package restaurant.backend;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public class prueba {

	
	@Id
	@GeneratedValue
	@Column
	private int id;
}
