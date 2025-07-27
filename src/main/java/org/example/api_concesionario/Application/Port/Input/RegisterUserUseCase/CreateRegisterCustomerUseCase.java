package org.example.api_concesionario.Application.Port.Input.RegisterUserUseCase;

import org.example.api_concesionario.Dto.Request.RegisterCustomerRequest;

public interface CreateRegisterCustomerUseCase {
    void SaveRegisterCustomer(RegisterCustomerRequest registerCustomerRequest);
}
