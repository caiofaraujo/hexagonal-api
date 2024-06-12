package com.codeline.hexagonal.adapters.out;

import com.codeline.hexagonal.adapters.out.repositories.CustomerRepository;
import com.codeline.hexagonal.adapters.out.repositories.mapper.CustomerEntityMapper;
import com.codeline.hexagonal.application.core.domain.Customer;
import com.codeline.hexagonal.application.ports.out.FindCustomerByIdOutputPort;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
public class FindCustomerByIdAdapter implements FindCustomerByIdOutputPort {

    @Autowired
    private CustomerRepository customerRepository;

    @Autowired
    CustomerEntityMapper customerEntityMapper;

    @Override
    public Optional<Customer> find(String id) {
        var customerEntity = customerRepository.findById(id);
        return customerEntity.map(entity -> customerEntityMapper.toCustomer(entity));
    }

}
