package com.backend.services;

import com.backend.models.DetailCart;
import com.backend.repository.DetailCartRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DetailCartServiceImpl implements DetailCartService{

    @Autowired
    private DetailCartRepository detailCartRepository;
    @Override
    public void createOrUpdate(DetailCart detailCart) {
        detailCartRepository.save(detailCart);
    }

    @Override
    public List<DetailCart> getAll() {
        List<DetailCart> list = detailCartRepository.findAll();
        return list;
    }

    @Override
    public DetailCart getDetailCart(Long id) {
        return detailCartRepository.findById(id).get();
    }

    @Override
    public void deleteDetailCart(Long id) {
        detailCartRepository.deleteById(id);
    }

    @Override
    public DetailCart editDetailCart(Long id) {
        return detailCartRepository.getOne(id);
    }
}
