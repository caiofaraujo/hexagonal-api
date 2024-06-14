package com.codeline.hexagonal.adapters.in.consumers.mapper;

import com.codeline.hexagonal.adapters.in.consumers.message.CustomerMessage;
import com.codeline.hexagonal.application.core.domain.Customer;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface CustomerMessageMapper {

    @Mapping(target = "address", ignore = true)
    Customer toCustomer(CustomerMessage  customerMessage);
}
