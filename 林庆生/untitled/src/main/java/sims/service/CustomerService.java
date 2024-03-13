package sims.service;

import sims.dao.CustomerDAO;

public class CustomerService {
    private CustomerDAO customerDAO = new CustomerDAO();

    public boolean login(String username, String password) {
        return customerDAO.find(username, password) != null;
    }
}