package org.example.api_concesionario.Mapper;

import org.example.api_concesionario.Domain.Model.Customer;
import org.example.api_concesionario.Domain.Model.User;
import org.example.api_concesionario.Dto.Request.RegisterCustomerRequest;
import org.example.api_concesionario.Enum.Rol;

public class RegisterMapper {
    public static Customer toCustomer(RegisterCustomerRequest registerCustomerRequest) {
        return new Customer(
                null,
                registerCustomerRequest.first_name(),
                registerCustomerRequest.last_name(),
                registerCustomerRequest.email(),
                registerCustomerRequest.phone(),
                registerCustomerRequest.Enum_document(),
                registerCustomerRequest.document(),
                null,
                null
        );
    }

    public static User toUserCustomer(RegisterCustomerRequest registerCustomerRequest) {
        return new User(
                null,
                registerCustomerRequest.email(),
                registerCustomerRequest.password(),
                Rol.CUSTOMER
        );
    }

    public static User toUserAdmin(RegisterCustomerRequest registerCustomerRequest) {
        return new User(
                null,
                registerCustomerRequest.email(),
                registerCustomerRequest.password(),
                Rol.ADMIN
        );
    }
}
