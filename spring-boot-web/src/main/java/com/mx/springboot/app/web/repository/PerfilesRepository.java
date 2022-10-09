package com.mx.springboot.app.web.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mx.springboot.app.web.model.Perfil;



public interface PerfilesRepository extends JpaRepository<Perfil, Integer> {

}
