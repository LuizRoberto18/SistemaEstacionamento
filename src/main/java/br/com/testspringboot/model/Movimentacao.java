package br.com.testspringboot.model;

import java.util.Date;

public class Movimentacao {
	
	 private int id;
	 private String placa, modelo; 
	 private Date data_entrada, data_saida;
	 private float tempo;
	 private int valor_pago; 
	 
	public Movimentacao(int id, String placa, String modelo, Date data_entrada, Date data_saida, float tempo,
			int valor_pago) {
		super();
		this.id = id;
		this.placa = placa;
		this.modelo = modelo;
		this.data_entrada = data_entrada;
		this.data_saida = data_saida;
		this.tempo = tempo;
		this.valor_pago = valor_pago;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getPlaca() {
		return placa;
	}
	public void setPlaca(String placa) {
		this.placa = placa;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public Date getData_entrada() {
		return data_entrada;
	}
	public void setData_entrada(Date data_entrada) {
		this.data_entrada = data_entrada;
	}
	public Date getData_saida() {
		return data_saida;
	}
	public void setData_saida(Date data_saida) {
		this.data_saida = data_saida;
	}
	public float getTempo() {
		return tempo;
	}
	public void setTempo(float tempo) {
		this.tempo = tempo;
	}
	public int getValor_pago() {
		return valor_pago;
	}
	public void setValor_pago(int valor_pago) {
		this.valor_pago = valor_pago;
	}
	 
}
