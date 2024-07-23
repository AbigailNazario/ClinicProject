package com.clinica.projetoClinica.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.clinica.projetoClinica.entities.Funcionario;
import com.clinica.projetoClinica.repositories.FuncionarioRepository;

@Service
public class FuncionarioService {

	@Autowired
	private FuncionarioRepository repository;
	
	public List<Funcionario> findAll() {
		return this.repository.findAll();
	}

	public Optional<Funcionario> findById(Long cpf) {
		return this.repository.findById(cpf);
	}

	public Funcionario save(Funcionario funcionario) {
		return this.repository.save(funcionario);
	}

	public void deleteById(Long cpf) {
		this.repository.deleteById(cpf);
	}
	
}
