package me.arnaumas.ud25.ex3.service;

import java.util.List;

import me.arnaumas.ud25.ex3.dto.Cajas;

public interface ICajasService {

	public List<Cajas> listarCajas();

	public Cajas guardarCajas(Cajas cajas);

	public Cajas CajasXID(String id);

	public List<Cajas> listarCajasAlmacenes(String almacen);

	public Cajas actualizarCajas(Cajas cajas);

	public void eliminarCajas(String numreferencia);
}
