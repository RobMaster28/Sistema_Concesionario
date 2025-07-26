package org.example.api_concesionario.Dto.Response;

import java.util.List;

public record ListCategoryCarResponse(
        List<FindCategoryCarResponse>ListCategoryCar
) {
}
