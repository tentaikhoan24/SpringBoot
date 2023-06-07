package com.backend.services;

import com.backend.models.Bill;
import com.backend.repository.BillRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BillServiceImpl implements BillService{

    @Autowired
    private BillRepository billRepository;
    @Override
    public void createOrUpdate(Bill bill) {
        billRepository.save(bill);
    }

    @Override
    public List<Bill> getAll() {
        List<Bill> list = billRepository.findAll();
        return list;
    }

    @Override
    public Bill getBill(Long id) {
        return billRepository.findById(id).get();
    }

    @Override
    public List<Bill> getBillByIdUser(Long id) {
        List<Bill> list = billRepository.getBillByIdUser(id);
        return list;
    }

    @Override
    public void deleteBill(Long id) {
        billRepository.deleteById(id);
    }

    @Override
    public Bill editBill(Long id) {
        return billRepository.getOne(id);
    }
}
