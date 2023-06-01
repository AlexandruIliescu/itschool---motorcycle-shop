package com.motorcycle.shop.services;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.motorcycle.shop.models.dtos.ProductDTO;
import com.motorcycle.shop.models.entities.Product;
import com.motorcycle.shop.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {

    private final ProductRepository productRepository;
    private final ObjectMapper objectMapper;

    @Autowired
    public ProductServiceImpl(ProductRepository productRepository,
                              ObjectMapper objectMapper) {
        this.productRepository = productRepository;
        this.objectMapper = objectMapper;
    }

    @Override
    public List<ProductDTO> findProductByBrandAndColourAndWeightAndPrice(String brand, String colour, int weight, double price) {
        List<Product> products = productRepository.findProductByBrandAndColourAndWeightAndPrice(brand, colour, weight, price);
        List<ProductDTO> productDTOS = new ArrayList<>();
        products.forEach(product -> fromProductEntityToProductDTO(productDTOS, product));

        return productDTOS;
    }

    private void fromProductEntityToProductDTO(List<ProductDTO> productDTOS, Product product) {
        ProductDTO productDTO = new ProductDTO();
        productDTO.setId(product.getId());
        productDTO.setBrand(product.getBrand());
        productDTO.setWeight(product.getWeight());
        productDTO.setColour(product.getColour());
        productDTO.setPrice(product.getPrice());
        productDTO.setYearOfManufacture(product.getYearOfManufacture().toLocalDate());
        productDTOS.add(productDTO);
    }
}