package org.example.api_concesionario.Dto.Response;

import java.util.UUID;

public record FindCarStoreResponse(
        UUID id_car,
        String carName,
        String url_img_car,
        double price,
        double price_convert
) {
}
