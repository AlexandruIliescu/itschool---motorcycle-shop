package com.motorcycle.shop.services;

import com.motorcycle.shop.models.dtos.CustomerDTO;

public interface CustomerService {

    CustomerDTO createCustomer(CustomerDTO customerDTO);
}