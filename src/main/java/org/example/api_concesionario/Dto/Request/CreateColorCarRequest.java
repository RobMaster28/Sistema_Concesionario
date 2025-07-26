package org.example.api_concesionario.Dto.Request;

public record CreateColorCarRequest(
        String url_img_car_color,
        String url_img_color,
        String name_color
) {
}
