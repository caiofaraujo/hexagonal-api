package com.codeline.hexagonal.adapters.out.clients.response;

import lombok.Data;

@Data
public class AddressResponse {
    private String street;
    private String city;
    private String state;
}
