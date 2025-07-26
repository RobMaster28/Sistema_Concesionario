package org.example.api_concesionario.Infrastructure.Persistence.Repository.CustomerRepository;

import lombok.RequiredArgsConstructor;
import org.example.api_concesionario.Application.Port.Output.CustomerRepositoryPort;
import org.example.api_concesionario.Domain.Model.Customer;
import org.springframework.stereotype.Repository;

@Repository
@RequiredArgsConstructor
public class JpaCustomerRepositoryAdapter implements CustomerRepositoryPort {

    private SpringDateCustomerRepository springDateCustomerRepository;

    @Override
    public Customer Save(Customer customer) {
        return null;
    }

}
