package org.example.api_concesionario.Application.Service;

import lombok.RequiredArgsConstructor;
import org.example.api_concesionario.Application.Port.Input.CategoryCarUseCase.CreateCategoryUseCase;
import org.example.api_concesionario.Domain.Model.CategoryCar;
import org.example.api_concesionario.Dto.Request.CreateCategoryCarRequest;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CategoryCarService implements CreateCategoryUseCase {
    @Override
    public CategoryCar saveCategoryCar(CreateCategoryCarRequest createCategoryCarRequest) {
        return null;
    }
}
