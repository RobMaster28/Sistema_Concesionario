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
    private UUID id;

}
