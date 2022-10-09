package com.mx.springboot.app.web.service.db;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import com.mx.springboot.app.web.model.Vacante;
import com.mx.springboot.app.web.repository.VacantesRepository;
import com.mx.springboot.app.web.service.IVacantesService;


@Service
@Primary
public class VacantesServiceJpa implements IVacantesService {

	@Autowired
	private VacantesRepository vacantesRepo; 
	
	
	@Override
	public List<Vacante> buscarTodas() {
		
		return vacantesRepo.findAll();
	}

	@Override
	public Vacante buscarPorId(Integer idVacante) {
		
		Optional<Vacante> optional = vacantesRepo.findById(idVacante);
		if(optional.isPresent()) {
			optional.get();
		}
		return null;
	}

	@Override
	public void guardar(Vacante vacante) {
		vacantesRepo.save(vacante);

	}

}
