package br.com.db1.controller;

import javax.faces.bean.ManagedBean;

@ManagedBean
public class EstadosDoSulController {
	private Uf uf = Uf.PR;
	
	public Uf[] getListaUf() {
		return Uf.values();
	}
	
	public Uf getUf() {
		return uf;
	}

}
