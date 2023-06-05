package com.motorcycle.shop.controllers;

import com.motorcycle.shop.models.dtos.ProductDTO;
import com.motorcycle.shop.models.entities.Product;
import com.motorcycle.shop.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/products")
public class ProductController {

    private final ProductService productService;

    @Autowired
    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping("/filter")
    public ResponseEntity<List<ProductDTO>> findProductByBrandAndColourAndWeightAndPrice(@RequestParam (required = false) String brand,
                                                                                         @RequestParam (required = false) String colour,
                                                                                         @RequestParam (required = false) Integer weight,
                                                                                         @RequestParam (required = false) Double price) {
       return ResponseEntity.ok(productService.findProductByBrandAndColourAndWeightAndPrice(brand, colour, weight, price));
    }

    @GetMapping
    public ResponseEntity<List<ProductDTO>> findAllProducts() {
        return ResponseEntity.ok(productService.findAllProducts());
    }
}