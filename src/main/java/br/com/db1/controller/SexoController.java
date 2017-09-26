package br.com.db1.controller;

public class SexoController {
	private Sexo sexo;
	public Sexo[] getListaSexo() {
		return Sexo.values();
	}
	public Sexo getSexo() {
		return sexo;
	}

}
