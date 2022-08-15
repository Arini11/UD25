package me.arnaumas.ud25.ex3.dto;

import java.util.List;
import javax.persistence.*;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
public class Almacenes {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private @Getter @Setter Long codigo;
	private @Getter @Setter String lugar;
	private @Getter @Setter int capacidad;

	// Per saber que s'ha de posar OneToMany i no al reves, pensar que primer va la classe on estem, i despres l'altra
	// Per tant es llegiria aixi: UN Almacen guarda MOLTES Cajas
	@OneToMany(mappedBy= "almacen") // Aqui va el nom de la variable de Cajas que guarda la referencia d'almacen
	private @Getter @Setter List<Cajas> cajas;
	

}
