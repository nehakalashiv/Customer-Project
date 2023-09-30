package com.web.Customer.Project.service;

import com.web.Customer.Project.entity.Customer;

import java.util.List;

public interface ICustomerService {
    public List<Customer> getAllCustomer();
    public Customer save(Customer customer);
    public Customer update(Customer customer,int customerId);
    public void delete(int customerId);
}
