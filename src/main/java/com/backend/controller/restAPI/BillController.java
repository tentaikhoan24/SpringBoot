package com.backend.controller.restAPI;

import com.backend.models.Bill;
import com.backend.services.BillService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/api/v1")
public class BillController {

    @Autowired
    private BillService billService;

    @PostMapping("/createBill")
    public Boolean createBill(@ModelAttribute Bill bill) {
        billService.createOrUpdate(bill);
        return true;
    }

    @GetMapping("/bills")
    public List<Bill> getAllBill(@PathVariable Long id) {
        List<Bill> list = billService.getAll();
        return list;
    }

    @GetMapping("/bill/{id}")
    public Bill getBill(@PathVariable Long id) {
        return billService.getBill(id);
    }

    @DeleteMapping("/bill/{id}")
    public Boolean deleteBill(@PathVariable Long id) {
        billService.deleteBill(id);
        return true;
    }
    @GetMapping("/editBill/{id}")
    public Bill editBill(@PathVariable Long id) {
        return billService.editBill(id);
    }

    @PutMapping("/updateBill")
    public Boolean updateBill(@ModelAttribute Bill bill) {
        billService.createOrUpdate(bill);
        return true;
    }
}
