package org.example.api_concesionario.Mapper;

import org.example.api_concesionario.Domain.Model.CategoryCar;
import org.example.api_concesionario.Dto.Request.CreateCategoryCarRequest;
import org.example.api_concesionario.Dto.Response.FindCategoryCarResponse;
import org.example.api_concesionario.Dto.Response.ListCategoryCarResponse;
import org.example.api_concesionario.Infrastructure.Persistence.Entity.CategoryCarEntity;

import java.util.List;

public class CategoryCarMapper {
    public static CategoryCar toCategoryCarFull(CategoryCarEntity  categoryCarEntity) {
        return new CategoryCar(
                categoryCarEntity.getId_category(),
                categoryCarEntity.getName_category(),
                categoryCarEntity.getIs_delete()
        );
    }

    public static CategoryCarEntity toCategoryCarEntityName(CategoryCar  categoryCar) {
        return new CategoryCarEntity(
                categoryCar.name_category()
        );
    }

    public static CategoryCar toCategoryCarEntityName(CreateCategoryCarRequest createCategoryCarRequest) {
        return new CategoryCar(
                null,
                createCategoryCarRequest.name_category(),
                null
        );
    }

    public static List<CategoryCar> toCategoryCars(List<CategoryCarEntity> categoryCarEntities) {
        return categoryCarEntities.stream()
                .map( CategoryCarMapper::toCategoryCarFull)
                .toList();
    }

    public static FindCategoryCarResponse toFindCategoryCarResponse(CategoryCar categoryCar) {
        return new FindCategoryCarResponse(
                categoryCar.id_category(),
                categoryCar.name_category()
        );
    }

    public static ListCategoryCarResponse toListCategoryCarResponse(List<CategoryCar> categoryCars) {
        return new ListCategoryCarResponse(
                categoryCars.stream()
                        .map(CategoryCarMapper::toFindCategoryCarResponse)
                        .toList()
        );
    }
}
