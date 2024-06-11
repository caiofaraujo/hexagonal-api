package com.codeline.hexagonal.adapters.out.clients.mapper;

import com.codeline.hexagonal.adapters.out.clients.response.AddressResponse;
import com.codeline.hexagonal.application.core.domain.Address;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface AddressResponseMapper {
    Address toAddress(AddressResponse addressResponse);
}
