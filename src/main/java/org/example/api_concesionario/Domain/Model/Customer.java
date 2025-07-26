package org.example.api_concesionario.Domain.Model;

import org.example.api_concesionario.Enum.TypeDocument;

import java.util.UUID;

public record Customer(
    UUID id_customer,
    String first_name,
    String last_name,
    String email,
    String phone,
    TypeDocument Enum_document,
    String document,
    Boolean is_deleted,
    User user
) {
}
