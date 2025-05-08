package com.example.backend.persistence;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PsuRepository extends JpaRepository<PsuEntity, Integer> {
    PsuEntity getPsuEntityById(Integer id);
}
