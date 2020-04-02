package com.luisdev.microservicios.app.usuarios.services;

import java.util.Optional;

import com.luisdev.microservicios.app.usuarios.models.entity.Alumno;

public interface AlumnoService {
	
	public Iterable<Alumno> findAll();
	
	public Optional<Alumno> findById(Long id);
	
	public Alumno save(Alumno alumno);
	
	public  void deleteById(Long id);

}
