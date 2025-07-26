package org.example.api_concesionario.Infrastructure.Persistence.Repository.UserRepository;

import lombok.RequiredArgsConstructor;
import org.example.api_concesionario.Application.Port.Output.UserRepositoryPort;
import org.example.api_concesionario.Domain.Model.User;
import org.example.api_concesionario.Infrastructure.Persistence.Entity.UserEntity;
import org.example.api_concesionario.Mapper.UserMapper;
import org.springframework.stereotype.Repository;

@Repository
@RequiredArgsConstructor
public class JpaUserRepositoryAdapter implements UserRepositoryPort {

    private final SpringDateUserRepository springDateUserRepository;

    @Override
    public User save(User user) {
        UserEntity userEntity = springDateUserRepository.save(
                UserMapper.toUserEntityWithoutId(user)
        );
        return UserMapper.toUserFull(userEntity);
    }

}
