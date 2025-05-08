package com.example.backend.persistence;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserPicksRepository extends JpaRepository<UserPicksEntity, Integer> {
    UserPicksEntity getUserPicksEntityById(Integer id);
}
