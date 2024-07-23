package com.clinica.projetoClinica.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.clinica.projetoClinica.entities.Clinica;
import com.clinica.projetoClinica.repositories.ClinicaRepository;

@Service
public class ClinicaService {
	@Autowired
	private ClinicaRepository repository;
	
	public List<Clinica> findAll() {
		return this.repository.findAll();
	}
	public Optional<Clinica> findById(Long numClinica) {
		return this.repository.findById(numClinica);
	}
	public Clinica save(Clinica clinica) {
		return this.repository.save(clinica);
	}
	public void deleteById(Long numClinica) {
		this.repository.deleteById(numClinica);		
	}
}
