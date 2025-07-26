package org.example.api_concesionario.Application.Port.Input.CustomerUseCase;

import org.example.api_concesionario.Domain.Model.Customer;

public interface CreateCustomerUseCase {
    Void SaveCustomer(Customer customer);
}
