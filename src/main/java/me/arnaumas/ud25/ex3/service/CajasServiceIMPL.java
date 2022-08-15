package me.arnaumas.ud25.ex3.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import me.arnaumas.ud25.ex3.dao.ICajasDAO;
import me.arnaumas.ud25.ex3.dto.Cajas;

@Service
public class CajasServiceIMPL implements ICajasService{

	@Autowired
	ICajasDAO iCajasDAO;
	@Override
	public List<Cajas> listarCajas() {
		return iCajasDAO.findAll();
	}

	@Override
	public Cajas guardarCajas(Cajas cajas) {
		return iCajasDAO.save(cajas);
	}

	@Override
	public Cajas CajasXID(String id) {
		return iCajasDAO.findById(id).get();
	}

	@Override
	public List<Cajas> listarCajasAlmacenes(String almacen) {
		return iCajasDAO.findByAlmacen(almacen);
	}

	@Override
	public Cajas actualizarCajas(Cajas cajas) {
		return iCajasDAO.save(cajas);
	}

	@Override
	public void eliminarCajas(String numreferencia) {
		iCajasDAO.deleteById(numreferencia);
		
	}
	
}
