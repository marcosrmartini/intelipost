package br.com.intelipost.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.intelipost.enuns.TipoOrdenagem;
import br.com.intelipost.model.Artista;
import br.com.intelipost.payload.ArtistaPayload;
import br.com.intelipost.payload.ArtistaPayloadBusca;
import br.com.intelipost.repository.ArtistaRepository;

@Service
public class ArtistaServiceImpl implements ArtistaService {

	@Autowired
	private ArtistaRepository artistaRepository;

	@Override
	public List<Artista> listagem() {
		return artistaRepository.findAll();
	}

	@Override
	public Artista incluir(Artista artista) {
		return artistaRepository.save(artista);
	}

	@Override
	public Artista alterar(Artista artista) {
		return artistaRepository.save(artista);
	}

	@Override
	public void excluir(Long id) {
		Optional<Artista> artista = artistaRepository.findById(id);
		if (artista.isPresent())
			artistaRepository.delete(artista.get());
	}

	@Override
	public Artista build(ArtistaPayload payload) {
		return new Artista(payload);
	}

	@Override
	public List<Artista> busca(ArtistaPayloadBusca payload) {
		if(payload.getOrdenagem() == TipoOrdenagem.ASC) 
			if (!payload.isPorTamanho())
				return artistaRepository.buscaAsc("%" + payload.getNome().toUpperCase() + "%");
			else
				return artistaRepository.buscaAscWithSize("%" + payload.getNome().toUpperCase() + "%");
			
		else if (!payload.isPorTamanho())
				return artistaRepository.buscaDesc("%" + payload.getNome().toUpperCase() + "%");
			else
				return artistaRepository.buscaDescWithSize("%" + payload.getNome().toUpperCase() + "%");
		
	}

}
