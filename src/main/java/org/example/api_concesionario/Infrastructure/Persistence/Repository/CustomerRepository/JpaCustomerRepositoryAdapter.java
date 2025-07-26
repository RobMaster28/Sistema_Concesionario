package org.example.api_concesionario.Infrastructure.Persistence.Repository.CustomerRepository;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

@Repository
@RequiredArgsConstructor
public class JpaCustomerRepositoryAdapter {
    private SpringDateCustomerRepository springDateCustomerRepository;
}
