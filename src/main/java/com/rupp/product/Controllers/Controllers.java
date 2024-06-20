package com.rupp.product.Controllers;

import com.rupp.product.models.Product;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class Controllers {
   @PostMapping("/products")
    public Product addProduct(@RequestBody Product product) {
       return product;
   }
   @GetMapping("/products/{id}")
    public Product getProductById(@PathVariable int id) {
       return getProductById(id);
   }
   @GetMapping("/products")
    public List<Product> getAllProducts() {
       return getAllProducts();
   }
   @PutMapping("/products/{id}")
    public Product updateProduct(@PathVariable int id, @RequestBody Product product) {
       return product;
   }


}
