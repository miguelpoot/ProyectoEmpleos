package net.empleos.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import net.empleos.model.Usuario;

public interface UsuariosRepository extends JpaRepository<Usuario, Integer> {

}
