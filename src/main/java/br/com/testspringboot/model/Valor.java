package br.com.testspringboot.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Valor {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id; 
	private int valorPrimeiraHora;
	private int valorDemaisHoras;
	private Date dataFim;
	
	public Valor(Long id, int valorPrimeiraHora, int valorDemaisHoras, Date dataFim) {
		super();
		this.id = id;
		this.valorPrimeiraHora = valorPrimeiraHora;
		this.valorDemaisHoras = valorDemaisHoras;
		this.dataFim = dataFim;
	}
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public int getvalorPrimeiraHora() {
		return valorPrimeiraHora;
	}
	public void setvalorPrimeiraHora(int valorPrimeiraHora) {
		this.valorPrimeiraHora = valorPrimeiraHora;
	}
	public int getvalorDemaisHoras() {
		return valorDemaisHoras;
	}
	public void setvalorDemaisHoras(int valorDemaisHoras) {
		this.valorDemaisHoras = valorDemaisHoras;
	}
	
	public Date getdataFim() {
		return dataFim;
	}
	public void setdataFim(Date dataFim) {
		this.dataFim = dataFim;
	}
	
}
