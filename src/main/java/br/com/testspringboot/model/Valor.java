package br.com.testspringboot.model;

import java.util.Date;

public class Valor {
	
	private int id; 
	private int valor_primeira_hora, valor_demais;
	private int horas;
	private Date data_fim;
	
	public Valor(int id, int valor_primeira_hora, int valor_demais, int horas, Date data_fim) {
		super();
		this.id = id;
		this.valor_primeira_hora = valor_primeira_hora;
		this.valor_demais = valor_demais;
		this.horas = horas;
		this.data_fim = data_fim;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getValor_primeira_hora() {
		return valor_primeira_hora;
	}
	public void setValor_primeira_hora(int valor_primeira_hora) {
		this.valor_primeira_hora = valor_primeira_hora;
	}
	public int getValor_demais() {
		return valor_demais;
	}
	public void setValor_demais(int valor_demais) {
		this.valor_demais = valor_demais;
	}
	public int getHoras() {
		return horas;
	}
	public void setHoras(int horas) {
		this.horas = horas;
	}
	public Date getData_fim() {
		return data_fim;
	}
	public void setData_fim(Date data_fim) {
		this.data_fim = data_fim;
	}
	
}
