package com.backend.repository;

import com.backend.models.DTO.DetailCartDTO;
import com.backend.models.DetailCart;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DetailCartRepository extends JpaRepository<DetailCart, Long> {

    @Query(value = "SELECT p.id AS product_id, p.name_product AS product_name,p.img AS img, p.price AS price, dt.amount_product AS amount_product, p.price*dt.amount_product AS total_amount FROM detail_cart dt INNER JOIN cart c ON dt.cart_id = c.id INNER JOIN product p ON dt.product_id = p.id WHERE c.id = :id_cart", nativeQuery = true)
    List<DetailCartDTO> showDetailCartByIdCart(@Param("id_cart")Long id_cart);
}
