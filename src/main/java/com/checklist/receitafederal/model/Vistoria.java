package com.checklist.receitafederal.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Vistoria implements Serializable{
	
	private static final long serialVersionUID =1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long codigo;
	
	
	private String Veiculo;
	private String local;
	private String data;
	private String Horario;
	
	
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
	public String getData() {
		return data;
	}
	public void setData(String data) {
		this.data = data;
	}
	public String getHorario() {
		return Horario;
	}
	public void setHorario(String horario) {
		Horario = horario;
	}
	
	

}
