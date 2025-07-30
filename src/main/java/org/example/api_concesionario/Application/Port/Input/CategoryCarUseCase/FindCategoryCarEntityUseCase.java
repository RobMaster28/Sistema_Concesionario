package org.example.api_concesionario.Application.Port.Input.CategoryCarUseCase;

import org.example.api_concesionario.Infrastructure.Persistence.Entity.CategoryCarEntity;

import java.util.UUID;

public interface FindCategoryCarEntityUseCase {
    CategoryCarEntity findCategoryCarEntityById(UUID id);
}
