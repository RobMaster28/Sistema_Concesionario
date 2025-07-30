package org.example.api_concesionario.Application.Service;

import lombok.RequiredArgsConstructor;
import org.example.api_concesionario.Application.Port.Input.CarUseCase.CreateCarUseCase;
import org.example.api_concesionario.Dto.Request.CreateCarRequest;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CarService implements CreateCarUseCase {

    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    @Override
    public void SaveCar(CreateCarRequest createCarRequest) {

    }


}
