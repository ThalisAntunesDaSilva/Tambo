package com.api.tambo.Repository;

import com.api.tambo.Entity.Producao;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 * TamboRepository by. Thalis Antunes
 */
public interface ProducaoRepository extends JpaRepository<Producao, Integer> {
Producao findById(int id);



}