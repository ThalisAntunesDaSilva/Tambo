package com.api.tambo.Repository;

import com.api.tambo.Entity.Cria;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 * TamboRepository by. Thalis Antunes
 */
public interface CriaRepository extends JpaRepository<Cria, Integer> {
Cria findById(int id);



}