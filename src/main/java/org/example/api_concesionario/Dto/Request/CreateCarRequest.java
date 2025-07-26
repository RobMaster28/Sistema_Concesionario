package org.example.api_concesionario.Dto.Request;

public record CreateCarRequest(
    String carName,
    String url_img_car,
    double price,
    int stock,
    String brand,
    String model,
    String engine,
    String traction,
    String transmission,
    String torque,
    String speed,
    String url_technicalSheet
) {
}
