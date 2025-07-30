package org.example.api_concesionario.Infrastructure.Persistence.Repository.CategoryRepository;

import lombok.RequiredArgsConstructor;
import org.example.api_concesionario.Application.Port.Output.CategoryCarRepositoryPort;
import org.example.api_concesionario.Domain.Model.CategoryCar;
import org.example.api_concesionario.Infrastructure.Persistence.Entity.CategoryCarEntity;
import org.example.api_concesionario.Mapper.CategoryCarMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
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

    @Value("${size_by_page}")
    private int size;

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
        CategoryCarEntity categoryCarEntity = springDateCategoryCarRepository.findByIdNotDelete(id)
                .orElseThrow( () -> new RuntimeException("No se encontró la categoria por id: " + id));
        CategoryCar categoryCar = CategoryCarMapper.toCategoryCarFull(categoryCarEntity);
        log.debug("Se encontró con exito el record {}", CategoryCar.class.getName());
        return categoryCar;
    }



    /**
     * Devuelve una lisa paginada de categorias
     * @param page El número de la página
     * @return devuelve un List<CategoryCarEntity>
     */
    @Override
    @Transactional
    public List<CategoryCar> findByPage(int page) {
        List<CategoryCarEntity>categoryCarEntities = springDateCategoryCarRepository.findAll(
                PageRequest.of(page,size)
        ).getContent();
        return CategoryCarMapper.toCategoryCars(categoryCarEntities);
    }

    /**
     * Devuelve la lista entera de categorias
     * @return devuelve un List<CategoryCarEntity>
     */
    @Override
    @Transactional
    public List<CategoryCar> findAll() {
        List<CategoryCarEntity>categoryCarEntities = springDateCategoryCarRepository.findAll();
        return CategoryCarMapper.toCategoryCars(categoryCarEntities);
    }


}
