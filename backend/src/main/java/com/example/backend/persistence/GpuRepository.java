package com.example.backend.persistence;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GpuRepository extends JpaRepository<GpuEntity, Integer> {
    GpuEntity getGpuEntityById(Integer id);
}
