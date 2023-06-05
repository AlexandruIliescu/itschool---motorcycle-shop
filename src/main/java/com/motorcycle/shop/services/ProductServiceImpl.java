package com.motorcycle.shop.services;

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

    @Autowired
    public ProductServiceImpl(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @Override
    public List<ProductDTO> findProductByBrandAndColourAndWeightAndPrice(String brand, String colour, int weight, double price) {
        List<Product> products = productRepository.findProductByBrandAndColourAndWeightAndPrice(brand, colour, weight, price);
        List<ProductDTO> productDTOList = new ArrayList<>();
        products.forEach(product -> fromProductEntityToProductDTO(productDTOList, product));

        return productDTOList;
    }

    @Override
    public List<ProductDTO> findAllProducts() {
        List<ProductDTO> productDTOList = new ArrayList<>();
        productRepository.findAll().forEach(product -> fromProductEntityToProductDTO(productDTOList, product));

        return productDTOList;
    }

    @Override
    public void deleteProductById(long id) {
        productRepository.deleteById(id);
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