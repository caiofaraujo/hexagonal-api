package com.codeline.hexagonal.application.core.usecase;

import com.codeline.hexagonal.application.ports.in.FindCustomerByIdInputPort;
import com.codeline.hexagonal.application.ports.out.DeleteCustomerOutputPort;

public class DeleteCustomerUseCase {

    DeleteCustomerOutputPort deleteCustomerOutputPort;
    FindCustomerByIdInputPort findCustomerByIdInputPort;

    public DeleteCustomerUseCase(DeleteCustomerOutputPort deleteCustomerOutputPort,
                                 FindCustomerByIdInputPort findCustomerByIdInputPort) {
        this.deleteCustomerOutputPort = deleteCustomerOutputPort;
        this.findCustomerByIdInputPort = findCustomerByIdInputPort;
    }

    void delete (String id) {
        findCustomerByIdInputPort.find(id);
        deleteCustomerOutputPort.delete(id);
    }
}
