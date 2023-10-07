package com.proyectofinal.productos.controller;

import com.proyectofinal.productos.model.Product;
import com.proyectofinal.productos.service.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("products")
public class ProductController {
    @Autowired
    private IProductService productServ;

    @Value("${server.port}")
    private int serverPort;

    @GetMapping("/get/{productCode}")
    public Product getProductById(@PathVariable Long productCode){
        return productServ.getProductByCode(productCode);
    }

    @GetMapping("/get")
    public List<Product> getAll(){
        System.out.println("Port: "+serverPort);
        return productServ.getAll();
    }

    @PostMapping("/create")
    public String createProduct(@RequestBody Product product){
        productServ.saveProduct(product);
        return "El producto fue creado correctamente";
    }
}
