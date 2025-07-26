package org.example.api_concesionario.Domain.Model;

import java.util.UUID;

public record GalleryCar(
    UUID id_galley,
    String nameGalley,
    Boolean is_delete,
    Car car
) {
}
