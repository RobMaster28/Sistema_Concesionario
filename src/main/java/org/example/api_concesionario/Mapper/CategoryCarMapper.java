package org.example.api_concesionario.Mapper;

import org.example.api_concesionario.Domain.Model.CategoryCar;
import org.example.api_concesionario.Infrastructure.Persistence.Entity.CategoryCarEntity;

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
}
