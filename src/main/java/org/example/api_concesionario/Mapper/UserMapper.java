package org.example.api_concesionario.Mapper;


import org.example.api_concesionario.Domain.Model.User;
import org.example.api_concesionario.Infrastructure.Persistence.Entity.UserEntity;

public class UserMapper {

    public static User toUserFull(UserEntity user) {
        return new User(
                user.getId_user(),
                user.getUsername(),
                user.getPassword(),
                user.getRole()
        );
    }

    public static UserEntity toUserEntityFull(User user) {
        return new UserEntity(
                user.id_user(),
                user.username(),
                user.password(),
                user.role()
        );
    }

    public static UserEntity toUserEntityWithoutId(User user) {
        return new UserEntity(
                user.username(),
                user.password(),
                user.role()
        );
    }
}
