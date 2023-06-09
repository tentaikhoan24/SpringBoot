package com.backend.controller.restAPI;

import com.backend.models.Product;
import com.backend.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("api/v1/")
public class ProductController {

    @Autowired
    private ProductService productService;

    @PostMapping("/createProduct")
    public Boolean createProduct(@ModelAttribute Product product) {
        productService.createOrUpdate(product);
        return true;
    }

    @GetMapping("/allProducts")
    public List<Product> getAllProduct() {
        List<Product> list = productService.getAllProduct();
        return list;
    }

    @GetMapping("/products")
    public List<Product> getProduct() {
        List<Product> list = productService.getProduct();
        return list;
    }
    @GetMapping("/product/{id}")
    public Product getProduct(@PathVariable Long id) {
        return productService.getProduct(id);
    }

    @GetMapping("/editProduct/{id}")
    public Product editProduct(@PathVariable Long id) {
        return productService.eidtProduct(id);
    }

    @DeleteMapping("/deleteProduct/{id}")
    public Boolean deleteProduct(@PathVariable Long id) {
        productService.deleteProduct(id);
        return true;
    }

    @DeleteMapping("/softDeleteProduct/{id}")
    public Boolean softDeleteProduct(@PathVariable Long id) {
        productService.softDeleteProduct(id);
        return true;
    }

    @PutMapping("/updateProduct")
    public Boolean updateProduct(@ModelAttribute Product product) {
        productService.createOrUpdate(product);
        return true;
    }
}
