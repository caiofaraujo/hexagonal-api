package com.codeline.hexagonal.adapters.in.controllers.response;

import com.codeline.hexagonal.adapters.out.clients.response.AddressResponse;
import com.codeline.hexagonal.application.core.domain.Address;
import lombok.Data;

@Data
public class CustomerResponse {
    private String id;
    private String name;
    private AddressResponse address;
    private String cpf;
    private Boolean isValidCpf;
}
