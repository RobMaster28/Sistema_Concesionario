package org.example.api_concesionario.Infrastructure.Persistence.Repository.UserRepository;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

@Repository
@RequiredArgsConstructor
public class JpaUserRepositoryAdapter {
    private SpringDateUserRepository springDateUserRepository;
}
