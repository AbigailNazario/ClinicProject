package com.clinica.projetoClinica.entities;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_funcionario")
public class Funcionario implements Serializable {
	
	private static final long serialVersionUID = 1L;

	@Id
	private Long cpf;
	
	@Column(nullable = false) 
	private String nome;
	
	@ManyToOne
	@JoinColumn(name = "num_clinica")
	private Clinica clinica;
	
	public Funcionario() {}
	
	public Funcionario(String nome, Long cpf) {
		this.nome = nome;
		this.cpf = cpf;
	}
	
	public Clinica getClinica() {
		return clinica;
	}
	public void setClinica(Clinica clinica) {
		this.clinica = clinica;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public Long getCpf() {
		return cpf;
	}
	public void setCpf(Long cpf) {
		this.cpf = cpf;
	}
		
}
