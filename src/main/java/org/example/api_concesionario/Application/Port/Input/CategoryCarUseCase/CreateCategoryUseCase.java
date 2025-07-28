package org.example.api_concesionario.Application.Port.Input.CategoryCarUseCase;

import org.example.api_concesionario.Domain.Model.CategoryCar;
import org.example.api_concesionario.Dto.Request.CreateCategoryCarRequest;

public interface CreateCategoryUseCase {
    CategoryCar saveCategoryCar(CreateCategoryCarRequest createCategoryCarRequest);
}
