package br.pontin.download;

public enum StatusDown {

	TRANSFERIDO("Arquivo transferido com sucesso."),
	TRANSFERINDO("Transferencia em Andamento..."),
	ERRO_AO_TRANSFERIR("Erro ao baixar arquivo.");
	
	private String status;

	private StatusDown(String status){
		this.status = status;
	}

	@Override
	public String toString() {
		return status;
	}
}
