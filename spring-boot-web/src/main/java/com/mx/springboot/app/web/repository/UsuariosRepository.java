package com.mx.springboot.app.web.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mx.springboot.app.web.model.Usuario;



public interface UsuariosRepository extends JpaRepository<Usuario, Integer> {

}
