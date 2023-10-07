package com.proyectofinal.productos.service;

import com.proyectofinal.productos.model.Product;

import java.util.List;

public interface IProductService {
    void saveProduct(Product pr);
    List<Product> getAll();
    Product getProductByCode(Long code);
    void deleteProductByCode(Long code);

}
