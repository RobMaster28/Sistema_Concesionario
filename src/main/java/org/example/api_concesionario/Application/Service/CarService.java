package org.example.api_concesionario.Application.Service;

import lombok.RequiredArgsConstructor;
import org.example.api_concesionario.Application.Port.Input.CarUseCase.CreateCarUseCase;
import org.example.api_concesionario.Application.Port.Input.CarUseCase.FindCarUseCase;
import org.example.api_concesionario.Application.Port.Input.CategoryCarUseCase.FindCategoryCarUseCase;
import org.example.api_concesionario.Application.Port.Output.CarRepositoryPort;
import org.example.api_concesionario.Domain.Model.Car;
import org.example.api_concesionario.Domain.Model.CategoryCar;
import org.example.api_concesionario.Domain.Service.SaveFile;
import org.example.api_concesionario.Dto.Request.CreateCarRequest;
import org.example.api_concesionario.Mapper.CarMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
@RequiredArgsConstructor
public class CarService implements CreateCarUseCase, FindCarUseCase {

    private final Logger log = LoggerFactory.getLogger(this.getClass());

    private final SaveFile  saveFile;

    private final CarRepositoryPort  carRepositoryPort;

    private final FindCategoryCarUseCase  findCategoryCarUseCase;

    @Override
    public void SaveCar(CreateCarRequest createCarRequest) {

        String url_img_car,url_file_technicalSheet;

        url_img_car = saveFile.summitFile(createCarRequest.url_img_car());
        url_file_technicalSheet = saveFile.summitFile(createCarRequest.url_technicalSheet());

        CategoryCar categoryCar = findCategoryCarUseCase.findCategoryCarById(createCarRequest.id_CategoryCar());

        Car car = CarMapper.toCarInitialization(url_img_car,url_file_technicalSheet,categoryCar,createCarRequest);

        car = carRepositoryPort.saveWithCategory(car);

    }

    @Override
    public Car findCarById(UUID id) {
        return null;
    }

    @Override
    public List<Car> ListCarsByPage(int page) {
        return List.of();
    }
}
