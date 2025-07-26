package org.example.api_concesionario.Domain.Model;

import java.util.UUID;

public record ColorCar(
    UUID id_color,
    String url_img_car_color,
    String url_img_color,
    String name_color,
    boolean is_deleted,
    Car car
) {
}
