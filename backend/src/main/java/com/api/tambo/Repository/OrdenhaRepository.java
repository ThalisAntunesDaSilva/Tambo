package com.api.tambo.Repository;

import com.api.tambo.Entity.Ordenha;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 * TamboRepository by. Thalis Antunes
 */
public interface OrdenhaRepository extends JpaRepository<Ordenha, Integer> {
Ordenha findById(int id);



}