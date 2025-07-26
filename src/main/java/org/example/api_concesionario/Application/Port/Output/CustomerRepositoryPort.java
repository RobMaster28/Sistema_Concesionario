package org.example.api_concesionario.Application.Port.Output;

import org.example.api_concesionario.Domain.Model.Customer;
import org.example.api_concesionario.Infrastructure.Persistence.Entity.UserEntity;

public interface CustomerRepositoryPort {
    Customer SaveWithUserEntity(Customer customer, UserEntity user);
}
