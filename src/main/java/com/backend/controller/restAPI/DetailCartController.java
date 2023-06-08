package com.backend.controller.restAPI;

import com.backend.models.DetailCart;
import com.backend.services.DetailCartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/api/v1/")
public class DetailCartController {

    @Autowired
    private DetailCartService detailCartService;

    @PostMapping("/createDetailCart")
    public Boolean createDetailCart(@ModelAttribute DetailCart detailCart) {
        detailCartService.createOrUpdate(detailCart);
        return true;
    }

    @GetMapping("/detailCarts")
    public List<DetailCart> getAllDetailCart() {
        List<DetailCart> list = detailCartService.getAll();
        return list;
    }

    @GetMapping("/detailCart/{id}")
    public DetailCart getDetailCart(@PathVariable Long id) {
        return detailCartService.getDetailCart(id);
    }

    @DeleteMapping("/detailCart/{id}")
    public Boolean deleteDetailCart(@PathVariable Long id) {
        detailCartService.deleteDetailCart(id);
        return true;
    }

    @GetMapping("/editDetailCart/{id}")
    public DetailCart editDetailCart(@PathVariable Long id) {
        return detailCartService.editDetailCart(id);
    }

    @PutMapping("/updateDetailCart")
    public Boolean updateDetailCart(@ModelAttribute DetailCart detailCart) {
        detailCartService.createOrUpdate(detailCart);
        return true;
    }
}
