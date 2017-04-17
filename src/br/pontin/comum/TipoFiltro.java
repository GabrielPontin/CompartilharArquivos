package br.pontin.comum;

public enum TipoFiltro {
	NOME("NOME_ARQUIVO"),
	TAMANHO_MIN("TAMANHO_MINIMO"),
	TAMANHO_MAX("TAMANHO_MAXIMO"),
	EXTENSAO("EXTENSAO_ARQUIVO");
	
	public String filtro;
	
	private TipoFiltro(String f){
		filtro = f;
	}
}
