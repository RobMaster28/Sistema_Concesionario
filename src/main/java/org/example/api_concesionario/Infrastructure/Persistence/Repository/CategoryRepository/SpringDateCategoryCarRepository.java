package org.example.api_concesionario.Infrastructure.Persistence.Repository.CategoryRepository;

import org.example.api_concesionario.Infrastructure.Persistence.Entity.CategoryCarEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface SpringDateCategoryCarRepository  extends JpaRepository<CategoryCarEntity, UUID> {

}
