package me.arnaumas.ud25.ex3.dto;

import javax.persistence.*;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.ToString.Exclude;

@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
public class Cajas {

	@Id
	private @Getter @Setter String num_ref;
	private @Getter @Setter String contenido;
	private @Getter @Setter int valor;
	
	@Exclude // Exclude del toString que genera Lombok per evitar erros
	@ManyToOne // MOLTES Cajas a UN Almacen
    @JoinColumn(name="codigo_almacen") // Aqui es posa el nom que te la FK a la bbdd
	private @Getter @Setter Almacenes almacen;


}