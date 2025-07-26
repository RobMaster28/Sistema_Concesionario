package org.example.api_concesionario.Mapper;

import org.example.api_concesionario.Domain.Model.Customer;
import org.example.api_concesionario.Infrastructure.Persistence.Entity.CustomerEntity;
import org.example.api_concesionario.Infrastructure.Persistence.Entity.UserEntity;

public class CustomerMapper {

    public static Customer toCustomerWithoutUserAndDelete(CustomerEntity customer) {
        return new Customer(
                customer.getId_customer(),
                customer.getFirst_name(),
                customer.getLast_name(),
                customer.getEmail(),
                customer.getPhone(),
                customer.getEnum_document(),
                customer.getDocument(),
                null,
                null
        );
    }

    public static CustomerEntity toCustomerEntityWithoutId(Customer customer, UserEntity userEntity) {
        return new CustomerEntity(
                customer.first_name(),
                customer.last_name(),
                customer.email(),
                customer.phone(),
                customer.Enum_document(),
                customer.document(),
                userEntity
        );
    }

}
