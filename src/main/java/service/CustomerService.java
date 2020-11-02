package service;

import model.Customer;

import java.util.List;

public interface CustomerService {
    void create(Customer customer);
    void update(int id, Customer customer);
    void delete(int id);
    Customer findById(int id);

    List<Customer> findAll();
}
