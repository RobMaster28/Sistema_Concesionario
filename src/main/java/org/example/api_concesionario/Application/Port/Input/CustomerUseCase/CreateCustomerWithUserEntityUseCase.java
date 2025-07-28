package org.example.api_concesionario.Application.Port.Input.CustomerUseCase;

import org.example.api_concesionario.Domain.Model.Customer;
import org.example.api_concesionario.Domain.Model.User;

public interface CreateCustomerWithUserEntityUseCase {
    Customer SaveCustomerWithUser(Customer customer, User user);
}
