package org.example.api_concesionario.Application.Service;

import lombok.RequiredArgsConstructor;
import org.example.api_concesionario.Application.Port.Input.CustomerUseCase.CreateCustomerWithUserEntityUseCase;
import org.example.api_concesionario.Application.Port.Output.CustomerRepositoryPort;
import org.example.api_concesionario.Domain.Model.Customer;
import org.example.api_concesionario.Domain.Model.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CustomerService implements CreateCustomerWithUserEntityUseCase {

    private final CustomerRepositoryPort customerRepositoryPort;
    private final Logger logger = LoggerFactory.getLogger(CustomerService.class);

    @Override
    public Customer SaveCustomerWithUser(Customer customer, User user) {

        logger.info(
                customer!=null && user != null ?
                        "La data del customer y el user paso el servicio con exito✔️":"Alguno de los puntos esta null‼️"
        );

        return customerRepositoryPort.SaveWithUserEntity(customer,user);
    }
}
