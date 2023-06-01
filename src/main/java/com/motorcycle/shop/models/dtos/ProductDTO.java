package com.motorcycle.shop.models.dtos;

import lombok.Data;

import java.io.Serializable;
import java.time.LocalDate;

@Data
public class ProductDTO implements Serializable {

    private long id;
    private String brand;
    private String colour;
    private int weight;
    private double price;
    private LocalDate yearOfManufacture;
}