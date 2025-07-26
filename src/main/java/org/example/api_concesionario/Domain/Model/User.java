package org.example.api_concesionario.Domain.Model;

import org.example.api_concesionario.Enum.Rol;

import java.util.UUID;

public record User(
    UUID id_user,
    String username,
    String password,
    Rol role
) {
}
