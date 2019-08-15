package br.com.intelipost.enuns;

public enum TipoOrdenagem {
	ASC(1), DESC(2);
	
	public int ordem;

	TipoOrdenagem(int valor) {
		ordem = valor;
	}

}
