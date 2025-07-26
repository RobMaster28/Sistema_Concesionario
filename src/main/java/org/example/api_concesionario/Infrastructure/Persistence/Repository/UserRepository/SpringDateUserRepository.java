package org.example.api_concesionario.Infrastructure.Persistence.Repository.UserRepository;

import org.example.api_concesionario.Infrastructure.Persistence.Entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface SpringDateUserRepository extends JpaRepository<UserEntity, UUID> {

}
