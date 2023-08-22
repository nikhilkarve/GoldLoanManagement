package com.nikhilkarve.service;

import com.nikhilkarve.entity.Customer;

import java.util.List;

public interface CustomerService {
    Customer save(Customer theCustomer);
    Customer findById(Integer id);
    List<Customer> findAll();
    void deleteById(int id);

}
