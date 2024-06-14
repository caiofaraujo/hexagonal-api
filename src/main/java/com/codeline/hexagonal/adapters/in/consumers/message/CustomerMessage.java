package com.codeline.hexagonal.adapters.in.consumers.message;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Objeto que será recebido do tópico Kafka
 * */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class CustomerMessage {
    private String id;
    private String name;
    private String zipCode;
    private String cpf;
    private Boolean isValidCpf;
}
