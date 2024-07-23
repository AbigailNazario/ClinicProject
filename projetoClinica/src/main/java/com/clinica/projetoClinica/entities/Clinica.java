package com.clinica.projetoClinica.entities;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_clinica")
public class Clinica implements Serializable{ 
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long numClinica;
	
	@Column(nullable = false) 
	private String endereco;
	
	@Column(nullable = false, unique = true) 
	private String nome;
	
	@OneToMany(mappedBy = "clinica", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Funcionario> funcionarios = new ArrayList<>();

	public Clinica () {}
	
	public Clinica(String nome, String endereco, Long numClinica) {
		this.nome = nome;
		this.endereco = endereco;
		this.numClinica = numClinica;
	}

	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public Long getNumClinica() {
		return numClinica;
	}
	public void setNumClinica(Long numClinica) {
		this.numClinica = numClinica;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
}
