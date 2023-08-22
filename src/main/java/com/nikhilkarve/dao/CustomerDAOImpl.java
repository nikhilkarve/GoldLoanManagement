package com.nikhilkarve.dao;

import com.nikhilkarve.entity.Customer;
import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class CustomerDAOImpl implements CustomerDAO{

    private EntityManager entityManager;

    @Autowired
    public CustomerDAOImpl(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @Override
    public Customer save(Customer theCustomer) {
        Customer dbCustomer = entityManager.merge(theCustomer);
        return dbCustomer;
    }

    @Override
    public Customer findById(Integer id) {
        return entityManager.find(Customer.class, id);
    }

    @Override
    public List<Customer> findAll() {
        TypedQuery<Customer> getALlUser = entityManager.createQuery("FROM Customer", Customer.class);
        List<Customer> customers = getALlUser.getResultList();
        return customers;
    }

    @Override
    public void deleteById(int theId){
        Customer customer = entityManager.find(Customer.class, theId);
        entityManager.remove(customer);
    }
}
