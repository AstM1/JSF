package br.com.db1.controller;

import javax.faces.bean.ManagedBean;

@ManagedBean
public class FormatarPalavraController {
	private String palavra;
	private String palavraFormatada;
	
	public void maiuscula() {
		palavraFormatada = palavra.toUpperCase();
	}
	public void minuscula() {
		palavraFormatada = palavra.toLowerCase();
	}
	public String getPalavra() {
		return palavra;
	}
	public void setPalavra(String palavra) {
		this.palavra = palavra;
	}
	public String getPalavraFormatada() {
		return palavraFormatada;
	}
	public void setPalavraFormatada(String palavraFormatada) {
		this.palavraFormatada = palavraFormatada;
	}
}
