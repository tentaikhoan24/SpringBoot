package com.backend.controller.restAPI;

import com.backend.models.Cart;
import com.backend.services.AccountService;
import com.backend.services.CartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/api/v1/")
public class CartController {

    @Autowired
    private CartService cartService;
    @Autowired
    private AccountService accountService;

    @PostMapping("/createCart")
    public Boolean createCart(@ModelAttribute Cart cart) {
        cartService.createOrUpdate(cart);
        return true;
    }

    @GetMapping("/carts")
    public List<Cart> getAllCart() {
        List<Cart> list = cartService.getAll();
        return list;
    }

    @GetMapping("/cart/{id}")
    public Cart getCart(@PathVariable Long id) {
        return cartService.getCart(id);
    }

    @DeleteMapping("/cart/{id}")
    public Boolean deleteCart(@PathVariable Long id) {
        cartService.delete(id);
        return true;
    }

    @GetMapping("/cartActive/{id}")
    public Long idCartActive(@PathVariable Long id) {
        return cartService.cartActive(id);
    }

    @GetMapping("/editCart/{id}")
    public Cart editCart(@PathVariable Long id) {
        return cartService.edit(id);
    }

    @PutMapping("/updateCart")
    public Boolean updateCart( @ModelAttribute Cart cart) {
        cartService.createOrUpdate(cart);
        return true;
    }

    @GetMapping("/setStatus/{id}")
    public Long setStatus(@PathVariable Long id) {
        cartService.setStatus(id);
        return cartService.cartActive(id);
    }
}
