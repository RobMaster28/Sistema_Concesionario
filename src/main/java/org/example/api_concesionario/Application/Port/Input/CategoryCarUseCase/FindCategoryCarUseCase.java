package org.example.api_concesionario.Application.Port.Input.CategoryCarUseCase;

import org.example.api_concesionario.Dto.Response.FindCategoryCarResponse;
import org.example.api_concesionario.Dto.Response.ListCategoryCarResponse;

import java.util.UUID;

public interface FindCategoryCarUseCase {
    FindCategoryCarResponse findCategoryCarResponseById(UUID id);
    ListCategoryCarResponse findByPageCategoryCars(int page);
    ListCategoryCarResponse findAllCategoryCars();
}
