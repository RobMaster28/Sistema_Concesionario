package org.example.api_concesionario.Infrastructure.Persistence.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.example.api_concesionario.Enum.PaymentMethod;

import java.time.LocalDateTime;
import java.util.UUID;

@Entity
@Table(name = "car_sold")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class CarSoldEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id_car_sold")
    private UUID id_car_sold;

    @ManyToOne(
            fetch = FetchType.LAZY,
            cascade = {CascadeType.REFRESH, CascadeType.MERGE}
    )
    @JoinColumn(
            name = "id_customer",
            referencedColumnName = "id_customer",
            nullable = false
    )
    private CustomerEntity customer;

    @ManyToOne(
            fetch = FetchType.LAZY,
            cascade = {CascadeType.REFRESH, CascadeType.MERGE}
    )
    @JoinColumn(
            name = "id_car",
            referencedColumnName = "id_car",
            nullable = false
    )
    private CarEntity car;

    @Column(name = "sale_date")
    private LocalDateTime sale_date;

    @Column(name = "sale_price",nullable = false)
    private Double sale_price;

    @Column(name = "payment_method",nullable = false)
    private PaymentMethod payment_method;
}
