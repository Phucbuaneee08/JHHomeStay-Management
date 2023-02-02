package com.arjuncodes.JHHomeStayManagement.service;

import com.arjuncodes.JHHomeStayManagement.entities.Customer;

public interface CustomerService {
    Customer save(Customer customer);
    Customer findCustomerById(long id);
    void deleteCustomer(long id);
}
