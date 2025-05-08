package com.example.backend.persistence;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PcCaseRepository extends JpaRepository<PcCaseEntity, Integer> {
    PcCaseEntity getPcCaseEntityById(Integer id);
}
