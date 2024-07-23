package com.clinica.projetoClinica.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.clinica.projetoClinica.entities.Funcionario;

public interface FuncionarioRepository extends JpaRepository<Funcionario, Long> {

}
