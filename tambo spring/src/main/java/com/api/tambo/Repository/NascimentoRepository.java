package com.api.tambo.Repository;

import com.api.tambo.Entity.Nascimento;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 * TamboRepository by. Thalis Antunes
 */
public interface NascimentoRepository extends JpaRepository<Nascimento, Integer> {
Nascimento findById(int id);



}