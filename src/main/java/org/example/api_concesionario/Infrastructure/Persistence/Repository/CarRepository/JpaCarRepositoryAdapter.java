package org.example.api_concesionario.Infrastructure.Persistence.Repository.CarRepository;

import lombok.RequiredArgsConstructor;
import org.example.api_concesionario.Application.Port.Output.CarRepositoryPort;
import org.example.api_concesionario.Domain.Model.Car;
import org.example.api_concesionario.Domain.Model.CategoryCar;
import org.example.api_concesionario.Infrastructure.Persistence.Entity.CarEntity;
import org.example.api_concesionario.Infrastructure.Persistence.Entity.CategoryCarEntity;
import org.example.api_concesionario.Mapper.CarMapper;
import org.example.api_concesionario.Mapper.CategoryCarMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.UUID;


@Repository
@RequiredArgsConstructor
public class JpaCarRepositoryAdapter implements CarRepositoryPort {

    @Value("${size_by_page}")
    private int size;
    private final SpringDateCarRepository springDateCarRepository;
    private final Logger log = LoggerFactory.getLogger(this.getClass());
    @Override
    @Transactional
    public Car saveWithCategory(Car car) {
        log.debug("Se esta guardado el vehiculo {} con categoria {} ",car.carName(), car.categoryCar().name_category() );
        CategoryCarEntity categoryCarEntity = CategoryCarMapper.toCategoryCarEntityFull(car.categoryCar());
        CarEntity carEntity = CarMapper.toCarEntityWithCategory(car, categoryCarEntity);
        carEntity = springDateCarRepository.save(carEntity);
        CategoryCar categoryCar = CategoryCarMapper.toCategoryCarFull(categoryCarEntity);
        log.info("Se a guardado correctamente el vehiculo ✔️️✔️️");
        return CarMapper.toCarWithCategory(carEntity,categoryCar);
    }

    @Override
    public Car findById(UUID id) {
        CarEntity carEntity = springDateCarRepository.findByIdNotDelete(id)
                .orElseThrow( () -> new RuntimeException("No se encontro el vehiculo con el id:" + id) );
        CategoryCar categoryCar = CategoryCarMapper.toCategoryCarFull(carEntity.getCategory());
        return CarMapper.toCarWithCategory(carEntity,categoryCar);
    }

    @Override
    public List<Car> findByPage(int page) {
        List<CarEntity> carEntities = springDateCarRepository.findAll(
                PageRequest.of(page,size)
        ).getContent();
        return CarMapper.toListCarWithoutCategory(carEntities);
    }

}
