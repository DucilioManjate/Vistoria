package com.checklist.receitafederal.model;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

import javax.persistence.*;

@Entity
public class Vistoria implements Serializable{
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long codigo;

	private String Veiculo;

	private String local;

	private LocalDate data;

	private LocalTime Horario;


	public long getCodigo() {
		return codigo;
	}

	public void setCodigo(long codigo) {
		this.codigo = codigo;
	}

	public String getVeiculo() {
		return Veiculo;
	}

	public void setVeiculo(String veiculo) {
		Veiculo = veiculo;
	}

	public String getLocal() {
		return local;
	}

	public void setLocal(String local) {
		this.local = local;
	}

	public LocalDate getData() {
		return data;
	}

	public void setData(LocalDate data) {
		this.data = data;
	}

	public LocalTime getHorario() {
		return Horario;
	}

	public void setHorario(LocalTime horario) {
		Horario = horario;
	}
}
