package org.example.api_concesionario.Application.Port.Input.UserUseCase;

import org.example.api_concesionario.Domain.Model.User;

public interface CreateUserUseCase {
    User SaveUser(User user);
}
