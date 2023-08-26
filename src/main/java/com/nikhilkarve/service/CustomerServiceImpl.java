package com.nikhilkarve.service;

import com.nikhilkarve.dao.CustomerRepository;
import com.nikhilkarve.entity.Customer;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CustomerServiceImpl implements CustomerService{
    private CustomerRepository customerRepository;

    @Autowired
    public CustomerServiceImpl(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    @Override
    public Customer save(Customer theCustomer) {
        return customerRepository.save(theCustomer);
    }

    @Override
    public Customer findById(Integer id) {
        Customer theCustomer = null;
        Optional<Customer> result = customerRepository.findById(id);
        if(result.isPresent()) theCustomer = result.get();
        else throw new RuntimeException("Did not find the customer : " + id);
        return theCustomer;
    }

    @Override
    public List<Customer> findAll() {
        return customerRepository.findAll();
    }

    @Transactional
    @Override
    public void deleteById(int id) {
        customerRepository.deleteById(id);
    }

}
