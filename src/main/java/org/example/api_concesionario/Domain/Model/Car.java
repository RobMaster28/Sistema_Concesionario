package org.example.api_concesionario.Domain.Model;

import org.example.api_concesionario.Infrastructure.Persistence.Entity.CategoryCarEntity;

import java.util.UUID;

public record Car(
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
        String url_technicalSheet,
        UUID id_category
) {
}
