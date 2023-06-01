package com.motorcycle.shop.services;

import com.motorcycle.shop.models.dtos.ProductDTO;
import com.motorcycle.shop.models.entities.Product;

import java.util.List;

public interface ProductService {

    List<ProductDTO> findProductByBrandAndColourAndWeightAndPrice(String brand, String colour, int weight, double price);
}