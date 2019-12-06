package br.com.intelipost.model;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

import br.com.intelipost.payload.ArtistaPayload;

@Entity
public class Artista implements Serializable {

	private static final long serialVersionUID = -3658365982933047190L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@NotBlank(message = "{artista.nome.not.blank}")
	private String nome;

	@OneToMany
	@JoinColumn(name = "artista_id")
	private List<Album> albuns;
	
	public Artista(){
		super();
	}
	public Artista(ArtistaPayload payload) {
		this.id = payload.getId();
		this.nome = payload.getNome();
		this.albuns = payload.getAlbuns();
	}

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
