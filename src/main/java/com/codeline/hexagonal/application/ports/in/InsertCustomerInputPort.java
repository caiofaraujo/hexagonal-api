package com.codeline.hexagonal.application.ports.in;

import com.codeline.hexagonal.application.core.domain.Customer;

public interface InsertCustomerInputPort {
    void insert(Customer customer, String zipCode);
}
