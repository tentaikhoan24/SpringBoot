package com.backend.models.DTO;


import lombok.Data;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;


@Data
public class DetailCartDTO {
    private Long id;
    private String product_name;
    private String img;
    private Long product_id;
    private int amount_product;
    private Long total_amount;
    private Long price;

    public DetailCartDTO(Long id, String product_name, String img, Long product_id, int amount_product, Long total_amount, Long price) {
        this.id = id;
        this.product_name = product_name;
        this.img = img;
        this.product_id = product_id;
        this.amount_product = amount_product;
        this.total_amount = total_amount;
        this.price = price;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getProduct_name() {
        return product_name;
    }

    public void setProduct_name(String product_name) {
        this.product_name = product_name;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public Long getProduct_id() {
        return product_id;
    }

    public void setProduct_id(Long product_id) {
        this.product_id = product_id;
    }

    public int getAmount_product() {
        return amount_product;
    }

    public void setAmount_product(int amount_product) {
        this.amount_product = amount_product;
    }

    public long getTotal_amount() {
        return total_amount;
    }

    public void setTotal_amount(long total_amount) {
        this.total_amount = total_amount;
    }

    public Long getPrice() {
        return price;
    }

    public void setPrice(Long price) {
        this.price = price;
    }
}
