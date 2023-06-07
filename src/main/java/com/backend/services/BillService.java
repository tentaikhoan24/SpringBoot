package com.backend.services;

import com.backend.models.Bill;

import java.util.List;

public interface BillService {

    public void createOrUpdate(Bill bill);

    public List<Bill> getAll();

    public Bill getBill(Long id);

    public List<Bill> getBillByIdUser(Long id);

    public void deleteBill(Long id);

    public Bill editBill(Long id);
}
