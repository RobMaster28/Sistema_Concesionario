package org.example.api_concesionario.Mapper;

import org.example.api_concesionario.Domain.Model.Car;
import org.example.api_concesionario.Domain.Model.CategoryCar;
import org.example.api_concesionario.Infrastructure.Persistence.Entity.CarEntity;
import org.example.api_concesionario.Infrastructure.Persistence.Entity.CategoryCarEntity;

import java.util.List;

public class CarMapper {
    public static CarEntity toCarEntityWithCategory(Car car, CategoryCarEntity categoryCarEntity) {
        return new CarEntity(
                car.carName(),
                car.url_img_car(),
                car.price(),
                car.stock(),
                car.brand(),
                car.model(),
                car.engine(),
                car.traction(),
                car.transmission(),
                car.torque(),
                car.speed(),
                car.url_technicalSheet(),
                categoryCarEntity
        );
    }
    public static Car toCarWithCategory(CarEntity carEntity, CategoryCar  categoryCar) {
        return new Car(
                carEntity.getId_car(),
                carEntity.getCarName(),
                carEntity.getUrl_img_car(),
                carEntity.getPrice(),
                carEntity.getStock(),
                carEntity.getBrand(),
                carEntity.getModel(),
                carEntity.getEngine(),
                carEntity.getTraction(),
                carEntity.getTransmission(),
                carEntity.getTorque(),
                carEntity.getSpeed(),
                carEntity.getTechnicalSheet(),
                categoryCar
        );
    }

    public static Car toCarWithoutCategory(CarEntity carEntity) {
        return new Car(
                carEntity.getId_car(),
                carEntity.getCarName(),
                carEntity.getUrl_img_car(),
                carEntity.getPrice(),
                carEntity.getStock(),
                carEntity.getBrand(),
                carEntity.getModel(),
                carEntity.getEngine(),
                carEntity.getTraction(),
                carEntity.getTransmission(),
                carEntity.getTorque(),
                carEntity.getSpeed(),
                carEntity.getTechnicalSheet(),
                null
        );
    }

    public static List<Car> toListCarWithoutCategory(List<CarEntity> carEntities) {
        return carEntities.stream()
                .map(CarMapper::toCarWithoutCategory)
                .toList();
    }
}
