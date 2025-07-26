package org.example.api_concesionario.Domain.Model;

import java.util.UUID;

public record InfoCar(
    UUID id,
    String urlImgInfoCar,
    String title,
    String descriptionInfo,
    Boolean is_left,
    Boolean is_deleted,
    Car car
) {
}
