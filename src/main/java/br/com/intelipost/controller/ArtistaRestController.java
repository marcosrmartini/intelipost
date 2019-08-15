package br.com.intelipost.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.intelipost.model.Artista;
import br.com.intelipost.payload.ArtistaPayload;
import br.com.intelipost.payload.ArtistaPayloadBusca;
import br.com.intelipost.service.ArtistaService;

@RestController
@RequestMapping(value = "/artista")
public class ArtistaRestController {

	@Autowired
	private ArtistaService artistaService;

	@GetMapping
	public List<Artista> findAll() {
		return artistaService.listagem();
	}

	@PostMapping
	public Artista incluir(@Valid @RequestBody ArtistaPayload payload) {
		return artistaService.incluir(artistaService.build(payload));
	}

	@PutMapping
	public Artista alterar(@Valid @RequestBody ArtistaPayload payload) {
		return artistaService.alterar(artistaService.build(payload));
	}

	@DeleteMapping("/{id}")
	public void removerArtista(@PathVariable("id") Long id) {
		artistaService.excluir(id);
	}
	
	@PostMapping("/busca")
	public List<Artista> busca(@Valid @RequestBody ArtistaPayloadBusca payload) {
		return artistaService.busca(payload);
	}

}