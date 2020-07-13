package com.api.tambo.Repository;

import com.api.tambo.Entity.Vaca;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 * TamboRepository by. Thalis Antunes
 */
public interface VacaRepository extends JpaRepository<Vaca, Integer> {
Vaca findById(int id);



}