package br.com.intelipost.payload;

import br.com.intelipost.enuns.TipoOrdenagem;

public class ArtistaPayloadBusca {

	private String nome;
	private TipoOrdenagem ordenagem;
	private Boolean porTamanho;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}

	public TipoOrdenagem getOrdenagem() {
		return ordenagem;
	}
	public void setOrdenagem(TipoOrdenagem ordenagem) {
		this.ordenagem = ordenagem;
	}
	public Boolean isPorTamanho() {
		return porTamanho;
	}
	public void setTamanho(Boolean porTamanho) {
		this.porTamanho = porTamanho;
	}
	
	
	
}
