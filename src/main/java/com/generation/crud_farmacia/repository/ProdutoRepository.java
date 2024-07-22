package com.generation.crud_farmacia.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;

import com.generation.crud_farmacia.model.Produto;

@Repository
public interface ProdutoRepository extends JpaRepository<Produto, Long>{
	
	public ResponseEntity<Produto> findAllByNomeContainingIgnoreCase(@Param("nome") String nome);
}
