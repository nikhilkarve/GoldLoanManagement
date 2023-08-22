package com.nikhilkarve.service;

import com.nikhilkarve.dao.CustomerDAO;
import com.nikhilkarve.entity.Customer;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerServiceImpl implements CustomerService{
    private CustomerDAO customerDAO;

    @Autowired
    public CustomerServiceImpl(CustomerDAO customerDAO) {
        this.customerDAO = customerDAO;
    }

    @Transactional
    @Override
    public Customer save(Customer theCustomer) {
        return customerDAO.save(theCustomer);
    }

    @Override
    public Customer findById(Integer id) {
        return customerDAO.findById(id);
    }

    @Override
    public List<Customer> findAll() {
        return customerDAO.findAll();
    }

    @Transactional
    @Override
    public void deleteById(int id) {
        customerDAO.deleteById(id);
    }
}
