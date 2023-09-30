package com.web.Customer.Project.service;

import com.web.Customer.Project.entity.Customer;
import com.web.Customer.Project.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerService implements ICustomerService{
    @Autowired
    private CustomerRepository customerRepository;
    @Override
    public List<Customer> getAllCustomer() {
        return customerRepository.findAll();
    }

    @Override
    public Customer save(Customer customer) {
        return customerRepository.save(customer);
    }

    @Override
    public Customer update(Customer customer, int customerId) {
        return customerRepository.save(customer);
    }

    @Override
    public void delete(int customerId) {
         customerRepository.deleteById(customerId);
    }
}
