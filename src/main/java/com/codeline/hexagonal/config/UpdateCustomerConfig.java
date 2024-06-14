package com.codeline.hexagonal.config;

import com.codeline.hexagonal.adapters.out.FindAddressByZipCodeAdapter;
import com.codeline.hexagonal.adapters.out.UpdateCustomerAdapter;
import com.codeline.hexagonal.application.core.usecase.FindCustomerByIdUseCase;
import com.codeline.hexagonal.application.core.usecase.UpdateCustomerUseCase;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class UpdateCustomerConfig {

    @Bean
    public UpdateCustomerUseCase updateCustomerUseCase(FindCustomerByIdUseCase findCustomerByIdUseCase,
                                                       FindAddressByZipCodeAdapter findAddressByZipCodeAdapter,
                                                       UpdateCustomerAdapter updateCustomerAdapter) {
        return new UpdateCustomerUseCase(findCustomerByIdUseCase, findAddressByZipCodeAdapter, updateCustomerAdapter);

    }

}
