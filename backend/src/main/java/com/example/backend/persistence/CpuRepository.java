package com.example.backend.persistence;

import org.springframework.data.jpa.repository.JpaRepository;

public interface CpuRepository extends JpaRepository<CpuEntity, Integer> {
    CpuEntity getCpuEntityById(Integer id);
}
