package org.example.api_concesionario.Application.Port.Output;

import org.example.api_concesionario.Dto.Request.RegisterCustomerRequest;

public interface RegisterRepositoryPort {
    RegisterCustomerRequest SaveRegisterCustomer(RegisterCustomerRequest registerCustomerRequest);
}
