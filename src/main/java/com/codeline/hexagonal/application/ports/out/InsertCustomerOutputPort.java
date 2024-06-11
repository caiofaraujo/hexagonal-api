package com.codeline.hexagonal.application.ports.out;

import com.codeline.hexagonal.application.core.domain.Customer;

public interface InsertCustomerOutputPort {
    void insert(Customer customer);
}
