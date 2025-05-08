package com.example.backend.persistence;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MemoryRamRepository extends JpaRepository<MemoryRamEntity, Integer> {
    MemoryRamEntity getMemoryRamEntityById(Integer id);
}
