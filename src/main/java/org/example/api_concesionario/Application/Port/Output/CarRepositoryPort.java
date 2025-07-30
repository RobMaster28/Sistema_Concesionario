package org.example.api_concesionario.Application.Port.Output;

import org.example.api_concesionario.Domain.Model.Car;
import org.example.api_concesionario.Domain.Model.CategoryCar;

public interface CarRepositoryPort {
    Car saveWithCategory(Car car);
}
