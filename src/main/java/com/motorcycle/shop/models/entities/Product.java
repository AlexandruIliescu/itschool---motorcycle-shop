package com.motorcycle.shop.models.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Date;
import java.util.Set;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
@Table(name = "products")
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(name = "brand")
    private String brand;
    @Column(name = "colour")
    private String colour;
    @Column(name = "weight")
    private int weight;
    @Column(name = "price")
    private double price;
    @Column(name = "year_of_manufacture")
    private Date yearOfManufacture;
    @ManyToMany(mappedBy = "products")
    private Set<Customer> customers;
}