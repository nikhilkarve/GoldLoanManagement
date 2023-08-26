package com.nikhilkarve.rest;

import com.nikhilkarve.entity.Customer;
import com.nikhilkarve.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class CustomerRestController {

    private CustomerService customerService;

    @Autowired
    public CustomerRestController(CustomerService customerService){
        this.customerService = customerService;
    }

    @GetMapping("/customers")
    public List<Customer> findAll(){
        return customerService.findAll();
    }

    @GetMapping("/customers/{customerId}")
    public Customer getCustomerById(@PathVariable int customerId) {
        Customer theCustomer = customerService.findById(customerId);
        if(theCustomer == null) throw new RuntimeException("Customer not found: " + customerId);
        return  theCustomer;
    }

    @PostMapping("/customers")
    public Customer addCustomer(@RequestBody Customer theCustomer) {
        theCustomer.setId(0);
        Customer dbCustomer = customerService.save(theCustomer);
        return dbCustomer;
    }

    @PutMapping("/customers")
    public Customer updateCustomer(@RequestBody Customer theCustomer) {
        Customer dbCustomer = customerService.save(theCustomer);
        return dbCustomer;
    }

    @DeleteMapping("/customers/{customerId}")
    public String deleteCustomer(@PathVariable int customerId){
        Customer theCustomer = customerService.findById(customerId);
        if(theCustomer == null) throw new RuntimeException("Customer ID not found- "+customerId);
        customerService.deleteById(customerId);
        return "Deleted customer ID : " + customerId;
    }
}
