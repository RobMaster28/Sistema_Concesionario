package org.example.api_concesionario.Infrastructure.Persistence.Repository.CarRepository;

import org.example.api_concesionario.Infrastructure.Persistence.Entity.CarEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.Optional;
import java.util.UUID;

public interface SpringDateCarRepository extends JpaRepository<CarEntity, UUID> {
    @Query("SELECT c FROM CarEntity  c WHERE c.id_car=:id AND c.is_deleted =false")
    Optional<CarEntity> findByIdNotDelete(@Param("id") UUID id);
}
