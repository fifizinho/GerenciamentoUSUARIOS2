package com.projeto.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projeto.entities.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {

}
