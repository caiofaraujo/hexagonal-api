package com.codeline.hexagonal.adapters.in.controllers.request;

import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Data
public class CustomerRequest {
    @NotBlank(message = "Nome não pode ser vazio.")
    private String name;

    @NotBlank(message = "CPF não pode ser vazio.")
    private String cpf;

    @NotBlank(message = "Cep não pode ser vazio.")
    private String zipCode;
}
