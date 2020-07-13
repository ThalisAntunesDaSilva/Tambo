package com.api.tambo.Repository;

import com.api.tambo.Entity.Touro;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 * TamboRepository by. Thalis Antunes
 */
public interface TouroRepository extends JpaRepository<Touro, Integer> {
Touro findById(int id);



}