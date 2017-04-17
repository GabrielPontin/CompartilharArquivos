package br.pontin.download;

import java.io.Serializable;

import javax.net.ssl.SSLEngineResult.Status;

public class Download implements Serializable{

	
	private static final long serialVersionUID = 1L;
	
	private String de;
	private Status status;
	private String nomeArquivo;
	private byte [] dadosABaixar;
	
	public String getDe() {
		return de;
	}
	public Download setDe(String de) {
		this.de = de;
		return this;
	}
	public String getNomeArquivo() {
		return nomeArquivo;
	}
	public Download setNomeArquivo(String nomeArquivo) {
		this.nomeArquivo = nomeArquivo;
		return this;
	}
	public Status getStatus() {
		return status;
	}
	public Download setStatus(Status status) {
		this.status = status;
		return this;
	}
	public byte[] getDadosABaixar() {
		return dadosABaixar;
	}
	public Download setDadosABaixar(byte[] dadosABaixar) {
		this.dadosABaixar = dadosABaixar;
		return this;
	}
}
