package br.com.testspringboot.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Movimentacao {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	 private Long id;
	 private String placa;
	 private String  modelo;
	 private Date dataEntrada;
	 private Date dataSaida;
	 private float tempo;
	 private int valorPago; 
	 
	public Movimentacao(Long id, String placa, String modelo, Date dataEntrada, Date dataSaida, float tempo,
			int valorPago) {
		super();
		this.id = id;
		this.placa = placa;
		this.modelo = modelo;
		this.dataEntrada = dataEntrada;
		this.dataSaida = dataSaida;
		this.tempo = tempo;
		this.valorPago = valorPago;
	}
	
	public Movimentacao(){

	}
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
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
	
	public Date getDataEntrada() {
		return dataEntrada;
	}

	public void setDataEntrada(Date dataEntrada) {
		this.dataEntrada = dataEntrada;
	}

	public Date getDataSaida() {
		return dataSaida;
	}

	public void setDataSaida(Date dataSaida) {
		this.dataSaida = dataSaida;
	}

	public float getTempo() {
		return tempo;
	}

	public void setTempo(float tempo) {
		this.tempo = tempo;
	}

	public int getValorPago() {
		return valorPago;
	}

	public void setValorPago(int valorPago) {
		this.valorPago = valorPago;
	}
	 
	@Override
	public String toString() {
		return getModelo() + getPlaca() + getDataEntrada() + getDataSaida() + getTempo() + getValorPago();
	}
}
