package com.checklist.receitafederal.model;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

import javax.persistence.*;

@Entity
public class Vistoria implements Serializable{
	//Evitar usar tipos primitivos, usar WrapperClasses
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long codigo;

	private String veiculo;

	private String local;

	private LocalDate data;

	private LocalTime horario;
	//Colocar construtor com todos argumentos e um sem nenhum argumento para Entidade funcionar
	public Vistoria(Long codigo, String veiculo, String local, LocalDate data, LocalTime horario) {
		this.codigo = codigo;
		this.veiculo = veiculo;
		this.local = local;
		this.data = data;
		this.horario = horario;
	}

	public Vistoria() {
	}

	public Long getCodigo() {
		return codigo;
	}

	public void setCodigo(Long codigo) {
		this.codigo = codigo;
	}

	public String getVeiculo() {
		return veiculo;
	}

	public void setVeiculo(String veiculo) {
		this.veiculo = veiculo;
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
		return horario;
	}

	public void setHorario(LocalTime horario) {
		this.horario = horario;
	}
}
