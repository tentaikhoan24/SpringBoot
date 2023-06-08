package com.backend.models;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name_product;

    private Long price;

    private String img;

    private Long amount;

    private Long product_type;

    public Long getIdProduct() {
        return id;
    }

    public void setIdProduct(Long idProduct) {
        this.id = idProduct;
    }

    public String getNameProduct() {
        return name_product;
    }

    public void setNameProduct(String name_product) {
        this.name_product = name_product;
    }

    public Long getPrice() {
        return price;
    }

    public void setPrice(Long price) {
        this.price = price;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public Long getAmount() {
        return amount;
    }

    public void setAmount(Long amount) {
        this.amount = amount;
    }

    public Long getProductType() {
        return product_type;
    }

    public void setProductType(Long product_type) {
        this.product_type = product_type;
    }
}