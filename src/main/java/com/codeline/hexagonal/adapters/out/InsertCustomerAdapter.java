package com.codeline.hexagonal.adapters.out;

import com.codeline.hexagonal.adapters.out.repositories.CustomerRepository;
import com.codeline.hexagonal.adapters.out.repositories.mapper.CustomerEntityMapper;
import com.codeline.hexagonal.application.core.domain.Customer;
import com.codeline.hexagonal.application.ports.out.InsertCustomerOutputPort;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class InsertCustomerAdapter implements InsertCustomerOutputPort {

    @Autowired
    private CustomerRepository customerRepository;

    @Autowired
    private CustomerEntityMapper customerEntityMapper;

    @Override
    public void insert(Customer customer) {
        customerRepository.save(customerEntityMapper.toCustomerEntity(customer));
    }
}
