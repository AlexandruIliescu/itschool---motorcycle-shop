package com.motorcycle.shop.controllers;

import com.motorcycle.shop.models.dtos.ProductDTO;
import com.motorcycle.shop.models.entities.Product;
import com.motorcycle.shop.services.ProductService;
import lombok.extern.slf4j.Slf4j;
import org.apache.catalina.connector.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Slf4j
@CrossOrigin(origins = "http://localhost:3000")
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

    @DeleteMapping("/{id}")
    public void deleteProductById(@PathVariable long id) {
        log.info("Product with id " + id + " was deleted.");
        productService.deleteProductById(id);
    }

    @GetMapping
    public ResponseEntity<List<ProductDTO>> findAllProducts() {
        log.info("Products retrieved.");
        return ResponseEntity.ok(productService.findAllProducts());
    }
}