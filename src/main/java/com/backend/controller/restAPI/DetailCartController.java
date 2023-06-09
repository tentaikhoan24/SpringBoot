package com.backend.controller.restAPI;

import com.backend.models.Cart;
import com.backend.models.DTO.DetailCartDTO;
import com.backend.models.DetailCart;
import com.backend.models.Product;
import com.backend.services.CartService;
import com.backend.services.DetailCartService;
import com.backend.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/api/v1/")
public class DetailCartController {

    @Autowired
    private DetailCartService detailCartService;
    @Autowired
    private CartService cartService;
    @Autowired
    private ProductService productService;


    @PostMapping("/createDetailCart")
    public Boolean createDetailCart(@ModelAttribute DetailCart detailCart) {
        detailCartService.createOrUpdate(detailCart);
        return true;
    }

    @GetMapping("/add/{idCart}/{idProduct}/{amount}")
    public boolean addProduct(@PathVariable("idCart")Long idCart,
                              @PathVariable("idProduct")Long idProduct,
                              @PathVariable("amount")Integer amount) {
        Cart cart = cartService.getCart(idCart);
        Product product = productService.getProduct(idProduct);
        DetailCart detailCart = new DetailCart();
        detailCart.setCart(cart);
        detailCart.setProduct(product);
        detailCart.setAmountProduct(amount);
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

    @GetMapping("/show/{id}")
    public List<DetailCartDTO> showDetailCartByIdCart(@PathVariable Long id) {
        List<DetailCartDTO> list = detailCartService.showDetailCartByIdCart(id);
        return list;
    }
}
