package com.example.repository;

import com.example.model.PaginaModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PaginaRepository extends JpaRepository<PaginaModel, Long> {
}
