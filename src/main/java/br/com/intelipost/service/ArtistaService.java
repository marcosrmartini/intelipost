package br.com.intelipost.service;

import java.util.List;

import javax.validation.Valid;

import br.com.intelipost.model.Artista;
import br.com.intelipost.payload.ArtistaPayload;
import br.com.intelipost.payload.ArtistaPayloadBusca;

public interface ArtistaService {
	
	public List<Artista> listagem();
	public Artista incluir(Artista artista);
	public Artista alterar(Artista artista);
	public void excluir(Long id);
	
	public Artista build(ArtistaPayload payload);
	public List<Artista> busca(ArtistaPayloadBusca payload);
	
	
}
