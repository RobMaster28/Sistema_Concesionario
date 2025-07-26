package org.example.api_concesionario.Application.Port.Output;

import org.example.api_concesionario.Domain.Model.User;

public interface UserRepositoryPort {
    User save(User user);
}
