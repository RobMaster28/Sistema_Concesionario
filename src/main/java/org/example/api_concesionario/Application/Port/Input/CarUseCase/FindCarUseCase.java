package org.example.api_concesionario.Application.Port.Input.CarUseCase;

import org.example.api_concesionario.Domain.Model.Car;

import java.util.List;
import java.util.UUID;

public interface FindCarUseCase {
    Car findCarById(UUID id);
    List<Car> ListCarsByPage(int page);
}
