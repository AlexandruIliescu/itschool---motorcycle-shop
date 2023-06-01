package com.motorcycle.shop.repositories;

import com.motorcycle.shop.models.entities.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Long> {

    //Query Creation from Method Names
    List<Customer> findByFirstNameAndLastNameAndEmail(String firstName, String lastName, String email);

    //Native Query
    @Query(value = "SELECT * FROM customers WHERE first_name = :firstName AND last_name = :lastName AND email = :email", nativeQuery = true)
    List<Customer> findByFirstNameAndLastNameAndEmail2(String firstName, String lastName, String email);

//    List<Customer> findCustomersByEmailIsEndingWithAndFirstNameContainingIgnoreCase(String email, String firstName);
}