package com.api.tambo.Repository;

import com.api.tambo.Entity.LeiteConsumido;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 * TamboRepository by. Thalis Antunes
 */
public interface LeiteConsumidoRepository extends JpaRepository<LeiteConsumido, Integer> {
    LeiteConsumido findById(int id);



}