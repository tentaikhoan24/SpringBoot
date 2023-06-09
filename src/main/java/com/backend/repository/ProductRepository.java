package com.backend.repository;

import com.backend.models.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {


    @Modifying
    @Transactional
    @Query(value = "UPDATE product p SET p.product_type = 0 WHERE p.id = :id", nativeQuery = true)
    void softDelete(@Param("id")Long id);

    @Query(value = "select * from product p where p.product_type = 1" , nativeQuery=true)
    List<Product> getProduct();
}
