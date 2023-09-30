package com.web.Customer.Project.controller;

import com.web.Customer.Project.entity.Customer;
import com.web.Customer.Project.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/customer")
public class CustomerController {
    @Autowired
    private CustomerService customerService;
    @GetMapping("/getCustomer")
    public List<Customer> getAllCustomer(){
        return customerService.getAllCustomer();
    }
    @PostMapping("/addCustomer")
    public Customer addCustomer(@RequestBody Customer customer){
        return customerService.save(customer);
    }
    @PutMapping("/updateCustomer/{customerId}")
    public Customer updateCustomer(@RequestBody Customer customer,@PathVariable("customerId") int customerId){
        return customerService.update(customer,customerId);
    }
    @DeleteMapping("/{customerId}")
    public String deleteCustomer(@PathVariable("customerId") int customerId){
        customerService.delete(customerId);
        return "Customer Deleted Successfully";
    }
}
