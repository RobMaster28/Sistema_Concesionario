package org.example.api_concesionario.Application.Service;

import lombok.RequiredArgsConstructor;
import org.example.api_concesionario.Application.Port.Input.CustomerUseCase.CreateCustomerWithUserEntityUseCase;
import org.example.api_concesionario.Application.Port.Output.CustomerRepositoryPort;
import org.example.api_concesionario.Domain.Model.Customer;
import org.example.api_concesionario.Domain.Model.User;
import org.example.api_concesionario.Infrastructure.Persistence.Entity.UserEntity;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CustomerService implements CreateCustomerWithUserEntityUseCase {

    private final CustomerRepositoryPort customerRepositoryPort;

    @Override
    public Customer SaveCustomerWithUser(Customer customer, User user) {
        return customerRepositoryPort.SaveWithUserEntity(customer,user);
    }
}
