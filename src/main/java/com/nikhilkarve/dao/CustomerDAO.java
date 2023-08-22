package com.nikhilkarve.dao;

import com.nikhilkarve.entity.Customer;

import java.util.List;

public interface CustomerDAO {
    Customer save(Customer theCustomer);
    Customer findById(Integer id);
    List<Customer> findAll();
    void deleteById(int theId);

}
