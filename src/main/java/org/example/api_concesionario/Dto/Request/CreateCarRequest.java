package org.example.api_concesionario.Dto.Request;

import org.springframework.web.multipart.MultipartFile;

public record CreateCarRequest(
    String carName,
    MultipartFile url_img_car,
    double price,
    int stock,
    String brand,
    String model,
    String engine,
    String traction,
    String transmission,
    String torque,
    String speed,
    MultipartFile url_technicalSheet
) {
}
