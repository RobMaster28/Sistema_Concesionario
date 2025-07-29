package org.example.api_concesionario.Application.Port.Output;

import org.example.api_concesionario.Domain.Model.CategoryCar;
import org.example.api_concesionario.Infrastructure.Persistence.Entity.CategoryCarEntity;

import java.util.UUID;

public interface CategoryCarRepositoryPort {
    CategoryCar save(CategoryCar categoryCar);
    CategoryCar findById(UUID id);
    CategoryCarEntity findEntityById(UUID id);

}
