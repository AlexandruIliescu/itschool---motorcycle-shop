package com.motorcycle.shop.services;

import com.motorcycle.shop.models.dtos.ProductDTO;

import java.util.List;

public interface ProductService {

    List<ProductDTO> findProductByBrandAndColourAndWeightAndPrice(String brand, String colour, int weight, double price);
    List<ProductDTO> findAllProducts();
}