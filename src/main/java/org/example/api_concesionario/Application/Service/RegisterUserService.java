package org.example.api_concesionario.Application.Service;

import lombok.RequiredArgsConstructor;
import org.example.api_concesionario.Application.Port.Input.CustomerUseCase.CreateCustomerWithUserEntityUseCase;
import org.example.api_concesionario.Application.Port.Input.RegisterUserUseCase.CreateRegisterCustomerUseCase;
import org.example.api_concesionario.Application.Port.Input.UserUseCase.CreateUserUseCase;
import org.example.api_concesionario.Domain.Model.Customer;
import org.example.api_concesionario.Domain.Model.User;
import org.example.api_concesionario.Dto.Request.RegisterCustomerRequest;
import org.example.api_concesionario.Mapper.RegisterMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class RegisterUserService implements CreateRegisterCustomerUseCase {

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    private final CreateCustomerWithUserEntityUseCase createCustomerWithUserEntityUseCase;

    private final CreateUserUseCase createUserUseCase;

    @Override
    public void SaveRegisterCustomer(RegisterCustomerRequest registerCustomerRequest) {

        logger.info("Guardando Customer");

        Customer customer = RegisterMapper.toCustomer(registerCustomerRequest);
        User user = RegisterMapper.toUserCustomer(registerCustomerRequest);

        logger.info("Mapeo de entidades al registro concreado");

        user = createUserUseCase.SaveUser(user);

        customer = createCustomerWithUserEntityUseCase.SaveCustomerWithUser(customer,user);

    }
}
