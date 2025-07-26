package org.example.api_concesionario.Dto.Response;

import java.util.UUID;

public record FindCategoryCarResponse(
    UUID id_category,
    String name_category
) {
}
