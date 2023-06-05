package com.motorcycle.shop.integrationTesting;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.motorcycle.shop.models.dtos.CustomerDTO;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

//@Slf4j
//@SpringBootTest
//@AutoConfigureMockMvc
class CustomerServiceIntegrationTest {

//    @Autowired
//    private MockMvc mockMvc;
//
//    @Test
//    void testCreateCustomerShouldPass() throws Exception {
//        CustomerDTO customerDTO = CustomerDTO.builder()
//                .firstName("John")
//                .lastName("Doe")
//                .email("john@gmail.com")
//                .build();
//        mockMvc.perform(post("/api/customers")
//                        .contentType(MediaType.APPLICATION_JSON)
//                        .content(objectToString(customerDTO)))
//                .andExpect(status().is(200))
////                .andDo(print())
//                .andExpect(jsonPath("$.firstName").value(customerDTO.getFirstName()));
//    }
//
//    private String objectToString(Object object) {
//        ObjectMapper objectMapper = new ObjectMapper();
//        try {
//            return objectMapper.writeValueAsString(object);
//        } catch (JsonProcessingException exception) {
//            log.error(exception.getMessage());
//        }
//        return null;
//    }
}