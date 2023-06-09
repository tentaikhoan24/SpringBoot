package com.backend.services;

import com.backend.models.DTO.DetailCartDTO;
import com.backend.models.DetailCart;

import java.util.List;

public interface DetailCartService {
    public void createOrUpdate(DetailCart detailCart);

    public List<DetailCart> getAll();

    public DetailCart getDetailCart(Long id);

    public void deleteDetailCart(Long id);

    public DetailCart editDetailCart(Long id);

    public List<DetailCartDTO> showDetailCartByIdCart(Long id);
}
