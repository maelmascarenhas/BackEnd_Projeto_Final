package com.example.repository;

import com.example.model.CarrosModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CarrosRepository extends JpaRepository<CarrosModel, Long> {
}
