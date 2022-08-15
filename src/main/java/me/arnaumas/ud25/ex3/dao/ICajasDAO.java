package me.arnaumas.ud25.ex3.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import me.arnaumas.ud25.ex3.dto.Cajas;

public interface ICajasDAO extends JpaRepository<Cajas, String>{
	
	public List<Cajas> findByAlmacen(String almacen);
	
}