package org.example.api_concesionario.Infrastructure.Persistence.Repository.CustomerRepository;

import org.example.api_concesionario.Infrastructure.Persistence.Entity.CustomerEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface SpringDateCustomerRepository extends JpaRepository<CustomerEntity, UUID> {
}


