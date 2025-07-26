package org.example.api_concesionario.Infrastructure.Persistence.Entity;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.UUID;

@Entity
@Table(name = "color_car")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class ColorCarEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id_color")
    private UUID id_color;

    @Column(name = "url_img_car_color", nullable = false, columnDefinition = "TEXT")
    private String url_img_car_color;

    @Column(name = "url_img_color", nullable = false, columnDefinition = "TEXT")
    private String url_img_color;

    @Column(name = "name_color", nullable = false, length = 50)
    private String name_color;

    @Column(name = "is_deleted", nullable = false)
    private boolean is_deleted;

    @ManyToOne(
            fetch = FetchType.LAZY,
            cascade = {CascadeType.REFRESH, CascadeType.MERGE}
    )
    @JoinColumn(
            name = "id_car",
            referencedColumnName = "id_car"
    )
    private CarEntity car;
}