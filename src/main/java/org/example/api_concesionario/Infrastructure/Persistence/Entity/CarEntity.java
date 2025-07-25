package org.example.api_concesionario.Infrastructure.Persistence.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.UUID;


@Entity
@Table(name = "car")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class CarEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id_car")
    private UUID id_car;

    @Column(name = "car_name", nullable = false, length = 150)
    private String carName;

    @Column(name = "url_img_car", nullable = false, columnDefinition = "TEXT")
    private String url_img_car;

    @Column(name = "price", nullable = false)
    private double price;

    @Column(name = "stock", nullable = false)
    private int stock;

    @Column(name = "brand", nullable = false, length = 150)
    private String brand;

    @Column(name = "model", nullable = false, length = 150)
    private String model;

    @Column(name = "engine", nullable = false, length = 150)
    private String engine;

    @Column(name = "traction", nullable = false, length = 40)
    private String traction;

    @Column(name = "transmission", nullable = false, length = 40)
    private String transmission;

    @Column(name = "torque", nullable = false, length = 40)
    private String torque;

    @Column(name = "speed", nullable = false, length = 40)
    private String speed;

    @Column(name = "technical_sheet", nullable = false, columnDefinition = "TEXT")
    private String technicalSheet;

    @Column(name = "is_deleted", nullable = false)
    private boolean id_deleted;

    @ManyToOne(
            fetch = FetchType.LAZY,
            cascade = {CascadeType.REFRESH, CascadeType.MERGE}
    )
    @JoinColumn(
            name = "id_category",
            referencedColumnName = "id_category"
    )
    private CategoryCarEntity category;
}