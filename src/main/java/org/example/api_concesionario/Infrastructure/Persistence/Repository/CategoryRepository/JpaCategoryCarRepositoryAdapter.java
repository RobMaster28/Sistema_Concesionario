package org.example.api_concesionario.Infrastructure.Persistence.Repository.CategoryRepository;

import lombok.RequiredArgsConstructor;
import org.example.api_concesionario.Application.Port.Output.CategoryCarRepositoryPort;
import org.example.api_concesionario.Domain.Model.CategoryCar;
import org.example.api_concesionario.Infrastructure.Persistence.Entity.CategoryCarEntity;
import org.example.api_concesionario.Mapper.CategoryCarMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.UUID;

/**
 * Esta clase se encarga de conectar a la base de datos
 * para hacer operaciones con CategoryCarEntity, las
 * que devuelven una Entity suelen ser para otro servicio
 * relacionado a CategoryCar.
 */
@Repository
@RequiredArgsConstructor
public class JpaCategoryCarRepositoryAdapter implements CategoryCarRepositoryPort {

    private final SpringDateCategoryCarRepository springDateCategoryCarRepository;

    private final Logger log =  LoggerFactory.getLogger(this.getClass());

    /**
     * Guarda un objeto CategoryCar en la base de datos.
     *
     * @param categoryCar el objeto CategoryCar que se desea guardar
     * @return el objeto CategoryCar guardado
     */
    @Override
    @Transactional
    public CategoryCar save(CategoryCar categoryCar) {

        /**
         * Falta logica para evitar que se guarden categorias con nombre repetidos
         */

        log.debug("Se esta guardando la categoria: {}", categoryCar.name_category());
        CategoryCarEntity categoryCarEntity = CategoryCarMapper.toCategoryCarEntityName(categoryCar);
        categoryCarEntity = springDateCategoryCarRepository.save(categoryCarEntity);
        log.info("Se ha guardado correctamente la categoria: {}", categoryCarEntity.getName_category());
        return CategoryCarMapper.toCategoryCarFull(categoryCarEntity);
    }

    /**
     * Busca un CategoryCar para un response
     * @param id El medio por el cual se busca
     * @return el objeto CategoryCar buscado.
     */
    @Override
    @Transactional
    public CategoryCar findById(UUID id) {
        log.debug("Buscando la categoria por id: {}", id);
        CategoryCarEntity categoryCarEntity = springDateCategoryCarRepository.findById(id)
                .orElseThrow( () -> new RuntimeException("No se encontró la categoria por id: " + id));
        if (categoryCarEntity.getIs_delete() == true) {
            throw new RuntimeException("No se encontró la categoria por id: " + id );
        }
        CategoryCar categoryCar = CategoryCarMapper.toCategoryCarFull(categoryCarEntity);
        return categoryCar;
    }

    /**
     * Busca un CategoryCarEntity para porder relacionarlo a un CarEntity
     * @param id El medio por el cual se busca
     * @return el objeto CategoryCar buscado.
     */
    @Override
    @Transactional
    public CategoryCarEntity findEntityById(UUID id) {
        CategoryCarEntity categoryCarEntity = springDateCategoryCarRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("No se encontró la categoria por id: " + id ));
        if (categoryCarEntity.getIs_delete() == true) {
            throw new RuntimeException("No se encontró la categoria por id: " + id );
        }
        return categoryCarEntity;
    }


}
