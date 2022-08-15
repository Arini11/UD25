package me.arnaumas.ud25.ex2.dto;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
@Table(name="Empleados")
public class Empleados {
	@Id
	private @Getter @Setter String dni;

	private @Getter @Setter String nombre;
	private @Getter @Setter String apellidos;

	@ManyToOne
	@JoinColumn(name = "departamento")
	private @Getter @Setter Departamentos departamento;

}
