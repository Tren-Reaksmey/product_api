package com.rupp.product.Services;

import com.rupp.product.models.Product;

import java.util.ArrayList;
import java.util.List;

public class ProductService {
ArrayList<Product> products;
    public List<Product> getProducts(){
        return products;
    }
    public List<Product> addProduct(Product product){
       products.add(product);
       return products;
    }
    public List<Product> getProductById(int id,Product product){
       id=product.getId();
       return products;
    }
    public Product updateProduct(int index,Product product){
         index = products.indexOf(product);
        products.set(index, product);
        return product;
    }
}
