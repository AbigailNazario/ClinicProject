package com.clinica.projetoClinica.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.clinica.projetoClinica.entities.Clinica;
import com.clinica.projetoClinica.service.ClinicaService;

@RestController
@RequestMapping(value = "/clinica")
public class ClinicaController {
	@Autowired
    private ClinicaService cliService;
	
	@GetMapping
	public List<Clinica>findAll(){ 
		List<Clinica>result = this.cliService.findAll();
		return result;
	}
	@GetMapping(value = "/{numClinica}")
	public Clinica findById(@PathVariable Long numClinica) {
		Clinica result = cliService.findById(numClinica).get();
		return result;
	}
	
	@PostMapping
	public Clinica insert(@RequestBody Clinica clinica) { 
		Clinica result = cliService.save(clinica);
		return result;
	}
	
	@PutMapping
	public void update(@RequestBody Clinica clinica) { 
		cliService.save(clinica);
	}
	
	@DeleteMapping(value = "/{numClinica}")
	public void deleteById(@PathVariable Long numClinica) {
		cliService.deleteById(numClinica);
	}
}
	