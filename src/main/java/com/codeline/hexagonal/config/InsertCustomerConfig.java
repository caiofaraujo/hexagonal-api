package com.codeline.hexagonal.config;

import com.codeline.hexagonal.adapters.out.FindAddressByZipCodeAdapter;
import com.codeline.hexagonal.adapters.out.InsertCustomerAdapter;
import com.codeline.hexagonal.application.core.usecase.InsertCustomerUseCase;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class InsertCustomerConfig {

    @Bean
    public InsertCustomerUseCase insertCustomerUseCase(FindAddressByZipCodeAdapter findAddressByZipCodeAdapter,
                                                       InsertCustomerAdapter insertCustomerAdapter) {
        return new InsertCustomerUseCase(findAddressByZipCodeAdapter, insertCustomerAdapter);

    }

}
