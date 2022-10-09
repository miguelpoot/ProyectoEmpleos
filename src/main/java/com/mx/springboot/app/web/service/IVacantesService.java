package com.mx.springboot.app.web.service;

import java.util.List;

import com.mx.springboot.app.web.model.Vacante;


public interface IVacantesService {
	List<Vacante> buscarTodas();
	Vacante buscarPorId(Integer idVacante);
	void guardar(Vacante vacante);
}
