package com.codeline.hexagonal.adapters.out;

import com.codeline.hexagonal.adapters.out.clients.FindAddressByZipCodeClient;
import com.codeline.hexagonal.adapters.out.clients.mapper.AddressResponseMapper;
import com.codeline.hexagonal.application.core.domain.Address;
import com.codeline.hexagonal.application.ports.out.FindAddressByZipCodeOutputPort;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class FindAddressByZipCodeAdapter implements FindAddressByZipCodeOutputPort {

    @Autowired
    private FindAddressByZipCodeClient findAddressByZipCodeClient;

    @Autowired
    private AddressResponseMapper addressResponseMapper;

    @Override
    public Address find(String zipCode) {
        var addressResponse = findAddressByZipCodeClient.find(zipCode);
        return addressResponseMapper.toAddress(addressResponse);
    }
}
