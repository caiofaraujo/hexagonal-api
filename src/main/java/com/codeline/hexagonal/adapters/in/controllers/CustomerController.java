package com.codeline.hexagonal.adapters.in.controllers;

import com.codeline.hexagonal.adapters.in.controllers.mapper.CustomerMapper;
import com.codeline.hexagonal.adapters.in.controllers.request.CustomerRequest;
import com.codeline.hexagonal.adapters.in.controllers.response.CustomerResponse;
import com.codeline.hexagonal.application.core.domain.Customer;
import com.codeline.hexagonal.application.ports.in.DeleteCustomerInputPort;
import com.codeline.hexagonal.application.ports.in.FindCustomerByIdInputPort;
import com.codeline.hexagonal.application.ports.in.InsertCustomerInputPort;
import com.codeline.hexagonal.application.ports.in.UpdateCustomerInputPort;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/customers")
public class CustomerController {

    @Autowired
    private InsertCustomerInputPort insertCustomerInputPort;

    @Autowired
    private FindCustomerByIdInputPort findCustomerByIdInputPort;

    @Autowired
    private UpdateCustomerInputPort updateCustomerInputPort;

    @Autowired
    private DeleteCustomerInputPort deleteCustomerInputPort;

    @Autowired
    private CustomerMapper customerMapper;

    @PostMapping
    public ResponseEntity<Void> insert(@Valid @RequestBody CustomerRequest customerRequest) {
        insertCustomerInputPort.insert(customerMapper.toCustomer(customerRequest), customerRequest.getZipCode());
        return ResponseEntity.ok().build();
    }

    @GetMapping("/{id}")
    public ResponseEntity<CustomerResponse> findById(@PathVariable("id") String id) {
        return ResponseEntity.ok().body(customerMapper.toCustomerResponse(findCustomerByIdInputPort.find(id)));
    }

    @PutMapping("/{id}")
    public ResponseEntity<Void> update(@PathVariable("id") String id,
                                       @Valid @RequestBody CustomerRequest customerRequest) {
        var customer = customerMapper.toCustomer(customerRequest);
        customer.setId(id);
        updateCustomerInputPort.update(customer, customerRequest.getZipCode());
        return ResponseEntity.noContent().build();
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable("id") String id) {
        deleteCustomerInputPort.delete(id);
        return ResponseEntity.noContent().build();
    }
}
