package org.example.api_concesionario.Infrastructure.Persistence.Repository.CarRepository;

import org.example.api_concesionario.Infrastructure.Persistence.Entity.CarEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface SpringDateCarRepository extends JpaRepository<CarEntity, UUID> {

}
