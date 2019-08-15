package br.com.intelipost.service;

import java.util.List;

import br.com.intelipost.model.Album;

public interface AlbumService {
	
	public List<Album> listagem();
	public Album incluir(Album album);
	public Album alterar(Album album);
	public void excluir(Long id);
	
	
}
