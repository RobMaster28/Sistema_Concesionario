package org.example.api_concesionario.Infrastructure.Persistence.Repository.CarRepository;

import lombok.RequiredArgsConstructor;
import org.example.api_concesionario.Application.Port.Output.CarRepositoryPort;
import org.example.api_concesionario.Domain.Model.Car;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;


@Repository
@RequiredArgsConstructor
public class JpaCarRepositoryAdapter implements CarRepositoryPort {

    private final SpringDateCarRepository springDateCarRepository;
    private final Logger log = LoggerFactory.getLogger(this.getClass());

    @Override
    @Transactional
    public Car saveWithCategory(Car car) {

        log.debug("Se esta guardado el vehiculo {} con categoria {} ", car.carName(), car.categoryCar().name_category() );



        return null;
    }

}
