package org.example.api_concesionario.Domain.Model;

import org.example.api_concesionario.Enum.PaymentMethod;

import java.time.LocalDateTime;
import java.util.UUID;

public record CarSold(
    UUID id_car_sold,
    Customer customer,
    Car car,
    LocalDateTime sale_date,
    Double sale_price,
    PaymentMethod payment_method
) {
}
