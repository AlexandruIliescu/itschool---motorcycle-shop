package com.motorcycle.shop.unitTesting;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.motorcycle.shop.models.dtos.CustomerDTO;
import com.motorcycle.shop.models.entities.Customer;
import com.motorcycle.shop.repositories.CustomerRepository;
import com.motorcycle.shop.services.CustomerServiceImpl;
import com.motorcycle.shop.services.CustomerValidationService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;

import static org.mockito.Mockito.when;

//@SpringBootTest
class CustomerServiceTest {

//    @InjectMocks
//    private CustomerServiceImpl customerService;
//    @Mock
//    private ObjectMapper objectMapper;
//    @Mock
//    private CustomerValidationService customerValidationService;
//    @Mock
//    private CustomerRepository customerRepository;
//
//    @Test
//    void testCreateCustomersShouldPass() {
//        //GIVEN
//        CustomerDTO customerDTO = CustomerDTO.builder()
//                .firstName("George")
//                .lastName("Ionescu")
//                .email("george@gmail.com")
//                .build();
//        Customer customerEntity = Customer.builder()
//                .firstName("George")
//                .lastName("Ionescu")
//                .email("george@gmail.com")
//                .build();
//        when(objectMapper.convertValue(customerDTO, Customer.class)).thenReturn(customerEntity);
//        when(customerRepository.save(customerEntity)).thenReturn(customerEntity);
//        when(objectMapper.convertValue(customerEntity, CustomerDTO.class)).thenReturn(customerDTO);
//        //WHEN
//        CustomerDTO resultCustomerDTO = customerService.createCustomer(customerDTO);
//        //THEN
//        Assertions.assertEquals(customerDTO, resultCustomerDTO);
//    }
}