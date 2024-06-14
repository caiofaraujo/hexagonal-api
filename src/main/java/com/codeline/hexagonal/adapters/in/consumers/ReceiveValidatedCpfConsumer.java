package com.codeline.hexagonal.adapters.in.consumers;

import com.codeline.hexagonal.adapters.in.consumers.mapper.CustomerMessageMapper;
import com.codeline.hexagonal.adapters.in.consumers.message.CustomerMessage;
import com.codeline.hexagonal.application.ports.in.UpdateCustomerInputPort;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class ReceiveValidatedCpfConsumer {

    @Autowired
    UpdateCustomerInputPort updateCustomerInputPort;

    @Autowired
    CustomerMessageMapper customerMessageMapper;

    @KafkaListener(topics = "tp-cpf-validated", groupId = "codeline")
    public void receive(CustomerMessage customerMessage) {
        updateCustomerInputPort.update(customerMessageMapper.toCustomer(customerMessage), customerMessage.getZipCode());
    }
}
