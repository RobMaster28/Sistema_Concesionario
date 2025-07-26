package org.example.api_concesionario.Application.Service;

import lombok.RequiredArgsConstructor;
import org.example.api_concesionario.Application.Port.Input.RegisterUserUseCase.CreateRegisterCustomerUseCase;
import org.example.api_concesionario.Dto.Request.RegisterCustomerRequest;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class RegisterUserService implements CreateRegisterCustomerUseCase {

    private Logger logger = LoggerFactory.getLogger(this.getClass());


    @Override
    public RegisterCustomerRequest SaveRegisterCustomer(RegisterCustomerRequest registerCustomerRequest) {
        

        return null;
    }
}
