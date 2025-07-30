package org.example.api_concesionario.Application.Port.Output;

import org.example.api_concesionario.Domain.Model.Car;

import java.util.List;
import java.util.UUID;

public interface CarRepositoryPort {
    Car saveWithCategory(Car car);
    Car findById(UUID id);
    List<Car> findByPage(int page);
}
