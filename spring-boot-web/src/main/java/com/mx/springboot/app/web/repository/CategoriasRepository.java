package com.mx.springboot.app.web.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import com.mx.springboot.app.web.model.Categoria;



//public interface CategoriasRepository extends CrudRepository<Categoria, Integer> {

public interface CategoriasRepository extends JpaRepository<Categoria, Integer> {

}
