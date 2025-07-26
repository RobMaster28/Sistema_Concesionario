package org.example.api_concesionario.Infrastructure.Persistence.Repository.UserRepository;

import lombok.RequiredArgsConstructor;
import org.example.api_concesionario.Application.Port.Output.UserRepositoryPort;
import org.example.api_concesionario.Domain.Model.User;
import org.springframework.stereotype.Repository;

@Repository
@RequiredArgsConstructor
public class JpaUserRepositoryAdapter implements UserRepositoryPort {

    private final SpringDateUserRepository springDateUserRepository;

    @Override
    public User save(User user) {
        return null;
    }

}
