package br.com.intelipost.payload;

import java.util.List;

import javax.validation.constraints.NotBlank;

import br.com.intelipost.model.Album;

public class ArtistaPayload {

	private Long id;
	@NotBlank(message = "{artista.nome.not.blank}")
	private String nome;
	
	private List<Album> albuns;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public List<Album> getAlbuns() {
		return albuns;
	}

	public void setAlbuns(List<Album> albuns) {
		this.albuns = albuns;
	}

}
