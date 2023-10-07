package com.proyectofinal.cart.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter @Setter
@AllArgsConstructor
@NoArgsConstructor
public class CartDTO {
    private Long id;
    private long total;
    private List<ProductDTO> productsList;
}
