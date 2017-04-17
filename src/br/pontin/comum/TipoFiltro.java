package br.pontin.comum;

public enum TipoFiltro {
	NOME("NOME_ARQUIVO"),
	TAMANHO_MINIMO("TAMANHO_MINIMO"),
	TAMANHO_MAXIMO("TAMANHO_MAXIMO"),
	EXTENSAO("EXTENSAO_ARQUIVO");
	
	public String filtro;
	
	private TipoFiltro(String f){
		filtro = f;
	}
}
