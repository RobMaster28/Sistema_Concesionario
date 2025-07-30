package org.example.api_concesionario.Application.Port.Input.CarUseCase;

import org.example.api_concesionario.Dto.Request.CreateCarRequest;

public interface CreateCarUseCase {
    void SaveCar(CreateCarRequest createCarRequest);
}
