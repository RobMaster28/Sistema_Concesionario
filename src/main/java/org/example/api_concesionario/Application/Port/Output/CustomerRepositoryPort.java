package org.example.api_concesionario.Application.Port.Output;

import org.example.api_concesionario.Domain.Model.Customer;

public interface CustomerRepositoryPort {
    Customer Save(Customer customer);
}
