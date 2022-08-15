package me.arnaumas.ud25.ex3.service;

import java.util.List;

import me.arnaumas.ud25.ex3.dto.Almacenes;

public interface IAlmacenesService {

	public List<Almacenes> listarAlmaceness();

	public Almacenes guardarAlmacenes(Almacenes Almacenes);

	public Almacenes AlmacenesXID(Long id);

	public Almacenes actualizarAlmacenes(Almacenes Almacenes);

	public void eliminarAlmacenes(Long id);
}