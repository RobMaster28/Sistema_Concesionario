package org.example.api_concesionario.Infrastructure.Persistence.Repository.CustomerRepository;

import lombok.RequiredArgsConstructor;
import org.example.api_concesionario.Application.Port.Output.CustomerRepositoryPort;
import org.example.api_concesionario.Domain.Model.Customer;
import org.example.api_concesionario.Infrastructure.Persistence.Entity.CustomerEntity;
import org.example.api_concesionario.Infrastructure.Persistence.Entity.UserEntity;
import org.example.api_concesionario.Mapper.CustomerMapper;
import org.springframework.stereotype.Repository;

@Repository
@RequiredArgsConstructor
public class JpaCustomerRepositoryAdapter implements CustomerRepositoryPort {

    private SpringDateCustomerRepository springDateCustomerRepository;

    @Override
    public Customer SaveWithUserEntity(Customer customer, UserEntity user) {
        CustomerEntity customerEntity = springDateCustomerRepository.save(
                CustomerMapper.toCustomerEntityWithoutId(customer, user)
        );
        return CustomerMapper.toCustomerWithoutUserAndDelete(customerEntity);
    }

}
