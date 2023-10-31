package com.projetogfuncionario.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projetogfuncionario.entities.Funcionario;

public interface FuncionarioRepository extends JpaRepository<Funcionario, Long> {

}
