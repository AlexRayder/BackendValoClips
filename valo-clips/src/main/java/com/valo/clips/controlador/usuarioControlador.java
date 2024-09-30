package com.valo.clips.controlador;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.valo.clips.modelo.usuario;
import com.valo.clips.repositorio.usuarioRepositorio;

@RestController
@RequestMapping("/api/Usuarios/")
@CrossOrigin(origins = "http://localhost:4200")
public class usuarioControlador {

	@Autowired
	private usuarioRepositorio repositorio;

	@GetMapping("/ObtenerUsuarios")
	public List<usuario> listarTodoLosUsuarios() {
		return repositorio.findAll();
	}
}
