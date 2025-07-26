package org.example.api_concesionario.Application.Service;

import lombok.RequiredArgsConstructor;
import org.example.api_concesionario.Application.Port.Input.UserUseCase.CreateUserUseCase;
import org.example.api_concesionario.Application.Port.Output.UserRepositoryPort;
import org.example.api_concesionario.Domain.Model.User;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserService implements CreateUserUseCase {

    private UserRepositoryPort  userRepositoryPort;

    @Override
    public Void SaveUser(User user) {
        return null;
    }

}
