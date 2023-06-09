package com.backend.repository;

import com.backend.models.Cart;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
public interface CartRepository extends JpaRepository<Cart, Long> {
    @Modifying
    @Transactional
    @Query(value = "UPDATE cart c SET c.status = 0 WHERE c.account_id = :id", nativeQuery = true)
    void setStatus(@Param("id")Long id);

    @Query(value = "select c.id from cart c where c.account_id = :id and status = 1 limit 1", nativeQuery = true)
    Long cartActive(@Param("id")Long id);
}
