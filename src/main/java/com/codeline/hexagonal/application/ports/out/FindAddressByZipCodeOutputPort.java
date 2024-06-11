package com.codeline.hexagonal.application.ports.out;

import com.codeline.hexagonal.application.core.domain.Address;

public interface FindAddressByZipCodeOutputPort {
    Address find(String zipCode);
}
