package org.example.api_concesionario.Domain.Model;

import java.util.UUID;

public record CategoryCar(
    UUID id_category,
    String name_category,
    Boolean is_delete
) {
}
