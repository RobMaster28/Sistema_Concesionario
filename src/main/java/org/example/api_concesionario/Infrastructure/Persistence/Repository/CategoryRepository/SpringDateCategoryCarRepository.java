package org.example.api_concesionario.Infrastructure.Persistence.Repository.CategoryRepository;

import org.example.api_concesionario.Infrastructure.Persistence.Entity.CategoryCarEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.Optional;
import java.util.UUID;

public interface SpringDateCategoryCarRepository  extends JpaRepository<CategoryCarEntity, UUID> {

    @Query("SELECT c FROM CategoryCarEntity c WHERE c.id_category=:id AND c.is_delete=false")
    Optional<CategoryCarEntity>findByIdNotDelete(@Param("id") UUID id);

}
