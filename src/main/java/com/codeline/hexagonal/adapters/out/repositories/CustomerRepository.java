package com.codeline.hexagonal.adapters.out.repositories;

import com.codeline.hexagonal.adapters.out.repositories.entity.CustomerEntity;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface CustomerRepository extends MongoRepository<CustomerEntity, String> {
}
