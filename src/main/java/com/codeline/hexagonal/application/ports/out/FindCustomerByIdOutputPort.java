package com.codeline.hexagonal.application.ports.out;

import com.codeline.hexagonal.application.core.domain.Customer;

import java.util.Optional;

public interface FindCustomerByIdOutputPort {
    Optional<Customer> find(String id);
}
