package me.arnaumas.ud25.ex1.dto;

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
public class Fabricantes {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private @Getter @Setter Long id;

	private @Getter @Setter String nombre;

	@OneToMany
	@JoinColumn(name = "id")
	private @Getter @Setter List<Articulos> articulos;

}
