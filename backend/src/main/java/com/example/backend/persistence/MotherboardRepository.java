package com.example.backend.persistence;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MotherboardRepository extends JpaRepository<MotherboardEntity, Integer> {
    MotherboardEntity getMotherboardEntityById(Integer id);
}
