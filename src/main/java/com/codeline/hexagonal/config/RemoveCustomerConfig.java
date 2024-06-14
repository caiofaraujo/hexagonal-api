package com.codeline.hexagonal.config;

import com.codeline.hexagonal.adapters.out.DeleteCustomerAdapter;
import com.codeline.hexagonal.adapters.out.FindAddressByZipCodeAdapter;
import com.codeline.hexagonal.adapters.out.UpdateCustomerAdapter;
import com.codeline.hexagonal.application.core.usecase.DeleteCustomerUseCase;
import com.codeline.hexagonal.application.core.usecase.FindCustomerByIdUseCase;
import com.codeline.hexagonal.application.core.usecase.UpdateCustomerUseCase;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RemoveCustomerConfig {

    @Bean
    public DeleteCustomerUseCase removeCustomerUseCase(DeleteCustomerAdapter deleteCustomerAdapter,
                                                       FindCustomerByIdUseCase findCustomerByIdUseCase) {
        return new DeleteCustomerUseCase(deleteCustomerAdapter, findCustomerByIdUseCase);

    }

}
