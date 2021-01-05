package com.api.tambo.Repository;

import com.api.tambo.Entity.Compra;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 * TamboRepository by. Thalis Antunes
 */
public interface CompraRepository extends JpaRepository<Compra, Integer> {
Compra findById(int id);


}
