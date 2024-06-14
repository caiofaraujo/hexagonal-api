package com.codeline.hexagonal.adapters.out;

import com.codeline.hexagonal.adapters.out.repositories.CustomerRepository;
import com.codeline.hexagonal.adapters.out.repositories.mapper.CustomerEntityMapper;
import com.codeline.hexagonal.application.core.domain.Customer;
import com.codeline.hexagonal.application.ports.out.UpdateCustomerOutputPort;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class UpdateCustomerAdapter implements UpdateCustomerOutputPort {

    @Autowired
    CustomerRepository customerRepository;

    @Autowired
    CustomerEntityMapper customerEntityMapper;

    @Override
    public void update(Customer customer) {
        customerRepository.save(customerEntityMapper.toCustomerEntity(customer));
    }

}
