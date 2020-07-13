package com.api.tambo.Repository;
import com.api.tambo.Entity.Produto;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 * TamboRepository by. Thalis Antunes
 */
public interface ProdutoRepository extends JpaRepository<Produto, Integer> {
Produto findById(int id);



}