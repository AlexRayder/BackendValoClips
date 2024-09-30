package com.valo.clips.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.valo.clips.modelo.usuario;

@Repository
public interface usuarioRepositorio extends JpaRepository<usuario, Long> {

}
