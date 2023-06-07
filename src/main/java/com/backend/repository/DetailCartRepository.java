package com.backend.repository;

import com.backend.models.DetailCart;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DetailCartRepository extends JpaRepository<DetailCart, Long> {
}
