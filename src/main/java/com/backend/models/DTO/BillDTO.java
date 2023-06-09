package com.backend.models.DTO;

import lombok.Data;

import java.time.LocalDate;

@Data
public class BillDTO {
    private Long id;
    private String name;
    private LocalDate date;
    private Long id_cart;
    private Long total_bill;

    public BillDTO(Long id, String name, LocalDate date, Long id_cart, Long total_bill) {
        this.id = id;
        this.name = name;
        this.date = date;
        this.id_cart = id_cart;
        this.total_bill = total_bill;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public Long getId_cart() {
        return id_cart;
    }

    public void setId_cart(Long id_cart) {
        this.id_cart = id_cart;
    }

    public Long getTotal_bill() {
        return total_bill;
    }

    public void setTotal_bill(Long total_bill) {
        this.total_bill = total_bill;
    }
}
