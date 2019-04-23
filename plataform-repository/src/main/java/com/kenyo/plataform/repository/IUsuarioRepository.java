package com.kenyo.plataform.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kenyo.plataform.model.Usuario;

public interface IUsuarioRepository extends JpaRepository<Usuario, Long> {

}
