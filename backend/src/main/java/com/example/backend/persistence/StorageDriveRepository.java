package com.example.backend.persistence;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StorageDriveRepository extends JpaRepository<StorageDriveEntity, Integer> {
    StorageDriveEntity getStorageDriveEntityById(Integer id);
}
