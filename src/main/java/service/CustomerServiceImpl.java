package service;

import model.Customer;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class CustomerServiceImpl implements CustomerService{
    private static List<Customer> customers;

    static {
        customers = new ArrayList<>();
        customers.add(new Customer(1, "John", 19, "Hanoi"));
        customers.add(new Customer(2, "Bill", 20, "Danang"));
        customers.add(new Customer(3, "Alex", 25, "Saigon"));
        customers.add(new Customer(4, "Adam", 23, "Beijin"));
        customers.add(new Customer(5, "Sophia", 30, "Miami"));
        customers.add(new Customer(6, "Rose", 27, "Newyork"));
    }

    @Override
    public void create(Customer customer) {

    }

    @Override
    public void update(int id, Customer customer) {

    }

    @Override
    public void delete(int id) {

    }

    @Override
    public Customer findById(int id) {
        return null;
    }

    @Override
    public List<Customer> findAll() {
        return customers;
    }
}
