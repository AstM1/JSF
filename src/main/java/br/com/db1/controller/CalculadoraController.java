package br.com.db1.controller;

import javax.faces.bean.ManagedBean;

@ManagedBean
public class CalculadoraController {
	private Integer valor1;
	private Integer valor2;
	private Integer resultado;

	public void soma() {
		resultado = valor1 + valor2;
	}

	public void multiplicacao() {
		resultado = valor1 * valor2;
	}

	public void divisao() {
	resultado = valor1 / valor2;
	}

	public void subtracao() {
		resultado = valor1 - valor2;
	}

	public Integer getValor1() {
		return valor1;
	}

	public void setValor1(Integer valor1) {
		this.valor1 = valor1;
	}

	public Integer getValor2() {
		return valor2;
	}

	public void setValor2(Integer valor2) {
		this.valor2 = valor2;
	}

	public Integer getResultado() {
		return resultado;
	}

	public void setResultado(Integer resultado) {
		this.resultado = resultado;
	}

}
