package com.codeline.hexagonal.adapters.out.repositories.mapper;

import com.codeline.hexagonal.adapters.out.repositories.entity.CustomerEntity;
import com.codeline.hexagonal.application.core.domain.Customer;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface CustomerEntityMapper {
    CustomerEntity toCustomerEntity(Customer customer);
}
