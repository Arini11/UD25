package me.arnaumas.ud25.ex1.dto;

import javax.persistence.*;
import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
public class Articulos {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private @Getter @Setter Long id;
	
	private @Getter @Setter String nombre;
	
	private @Getter @Setter int precio;
	
	@ManyToOne
    @JoinColumn(name="fabricante")
    private Fabricantes fabricante;

	@JsonIgnore
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "Fabricantes")
	public Fabricantes getFabricantes() {
		return fabricante;
	}
}
