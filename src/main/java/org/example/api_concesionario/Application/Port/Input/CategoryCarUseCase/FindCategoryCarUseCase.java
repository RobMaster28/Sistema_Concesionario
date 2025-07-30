package org.example.api_concesionario.Application.Port.Input.CategoryCarUseCase;

import org.example.api_concesionario.Domain.Model.CategoryCar;
import org.example.api_concesionario.Dto.Response.FindCategoryCarResponse;
import org.example.api_concesionario.Dto.Response.ListCategoryCarResponse;
import org.example.api_concesionario.Infrastructure.Persistence.Entity.CategoryCarEntity;

import java.util.List;
import java.util.UUID;

public interface FindCategoryCarUseCase {
    FindCategoryCarResponse findCategoryCarById(UUID id);
    ListCategoryCarResponse findByPageCategoryCars(int page);
    ListCategoryCarResponse findAllCategoryCars();
}
