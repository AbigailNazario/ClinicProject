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

import com.clinica.projetoClinica.entities.Funcionario;
import com.clinica.projetoClinica.service.FuncionarioService;

@RestController
@RequestMapping(value = "/funcionario")
public class FuncionarioController { 
	@Autowired
    private FuncionarioService funService;
	
	@GetMapping
	public List<Funcionario>findAll(){ 
		List<Funcionario>result = this.funService.findAll();
		return result;
	}

	@GetMapping(value = "/{cpf}")
	public Funcionario findById(@PathVariable Long cpf) { 
		Funcionario result = funService.findById(cpf).get();
		return result;
	}
	
	@PostMapping
	public Funcionario insert(@RequestBody Funcionario funcionario) { 
		Funcionario result = funService.save(funcionario);
		return result;
	}
	
	@PutMapping
	public void update(@RequestBody Funcionario funcionario) { 
		funService.save(funcionario);
	}
	
	@DeleteMapping(value = "/{cpf}")
	public void deleteById(@PathVariable Long cpf) {
		funService.deleteById(cpf);
	}
	
}
