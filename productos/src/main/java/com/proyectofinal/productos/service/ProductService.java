package com.proyectofinal.productos.service;

import com.proyectofinal.productos.model.Product;
import com.proyectofinal.productos.repository.IProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService implements IProductService {

    @Autowired
    private IProductRepository productRepo;

    @Override
    public void saveProduct(Product pr) {
        productRepo.save(pr);
    }
    @Override
    public List<Product> getAll() {
        return productRepo.findAll();
    }

    @Override
    public Product getProductByCode(Long code) {
        return productRepo.findById(code).orElse(null);
    }

    @Override
    public void deleteProductByCode(Long code) {
        productRepo.deleteById(code);
    }
}
