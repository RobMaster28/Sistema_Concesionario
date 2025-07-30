package org.example.api_concesionario.Application.Service;

import lombok.RequiredArgsConstructor;
import org.example.api_concesionario.Application.Port.Input.CategoryCarUseCase.CreateCategoryUseCase;
import org.example.api_concesionario.Application.Port.Input.CategoryCarUseCase.FindCategoryCarEntityUseCase;
import org.example.api_concesionario.Application.Port.Input.CategoryCarUseCase.FindCategoryCarUseCase;
import org.example.api_concesionario.Application.Port.Output.CategoryCarRepositoryPort;
import org.example.api_concesionario.Domain.Model.CategoryCar;
import org.example.api_concesionario.Dto.Request.CreateCategoryCarRequest;
import org.example.api_concesionario.Dto.Response.FindCategoryCarResponse;
import org.example.api_concesionario.Dto.Response.ListCategoryCarResponse;
import org.example.api_concesionario.Infrastructure.Persistence.Entity.CategoryCarEntity;
import org.example.api_concesionario.Mapper.CategoryCarMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
@RequiredArgsConstructor
public class CategoryCarService implements CreateCategoryUseCase, FindCategoryCarUseCase, FindCategoryCarEntityUseCase {

    private final CategoryCarRepositoryPort categoryCarRepositoryPort;

    private final Logger log =  LoggerFactory.getLogger(CategoryCarService.class);

    @Override
    public void saveCategoryCar(CreateCategoryCarRequest createCategoryCarRequest) {
        log.info("Iniciando el Metodo saveCategoryCar");
        CategoryCar categoryCar = CategoryCarMapper.toCategoryCarEntityName(createCategoryCarRequest);
        categoryCarRepositoryPort.save(categoryCar);
        log.info("El Metodo saveCategoryCar fue realizado con exitoso✔️✔️");
    }

    @Override
    public FindCategoryCarResponse findCategoryCarById(UUID id) {
        log.info("Iniciando el Metodo findCategoryCarById");
        CategoryCar categoryCar = categoryCarRepositoryPort.findById(id);
        log.info("El Metodo findCategoryCarById fue realizado con exitoso✔️✔️");
        return CategoryCarMapper.toFindCategoryCarResponse(categoryCar);
    }

    @Override
    public CategoryCarEntity findCategoryCarEntityById(UUID id) {
        log.info("Iniciando el Metodo findCategoryCarEntityById");
        CategoryCarEntity categoryCar = categoryCarRepositoryPort.findEntityById(id);
        log.info("El Metodo findCategoryCarEntityById fue realizado con exitoso✔️✔️");
        return categoryCar;
    }

    @Override
    public ListCategoryCarResponse findByPageCategoryCars(int page) {
        log.info("Iniciando el Metodo findByPageCategoryCars");
        List<CategoryCar> categoryCars = categoryCarRepositoryPort.findByPage(page);
        log.info("El Metodo findByPageCategoryCars fue realizado con exitoso✔️✔️");
        return CategoryCarMapper.toListCategoryCarResponse(categoryCars);
    }

    @Override
    public ListCategoryCarResponse findAllCategoryCars() {
        log.info("Iniciando el Metodo findAllCategoryCars");
        List<CategoryCar> categoryCars = categoryCarRepositoryPort.findAll();
        log.info("El Metodo findAllCategoryCars fue realizado con exitoso✔️✔️");
        return CategoryCarMapper.toListCategoryCarResponse(categoryCars);
    }
}
