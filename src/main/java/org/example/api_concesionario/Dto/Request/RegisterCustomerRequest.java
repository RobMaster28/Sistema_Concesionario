package org.example.api_concesionario.Dto.Request;

import org.example.api_concesionario.Enum.TypeDocument;

public record RegisterCustomerRequest(
    String first_name,
    String last_name,
    String email,
    String phone,
    TypeDocument Enum_document,
    String document,
    String password
) {
}
