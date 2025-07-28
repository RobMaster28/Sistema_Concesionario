package org.example.api_concesionario.Application.Service;

import lombok.RequiredArgsConstructor;
import org.example.api_concesionario.Application.Port.Input.UserUseCase.CreateUserUseCase;
import org.example.api_concesionario.Application.Port.Output.UserRepositoryPort;
import org.example.api_concesionario.Domain.Model.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserService implements CreateUserUseCase {

    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    private final UserRepositoryPort  userRepositoryPort;

    @Override
    public User SaveUser(User user) {
        logger.info(
                user!=null ? "La data del user paso el servicio con exito!" : "La data del user esta null‼️"
        );
        return userRepositoryPort.save(user);
    }

}
