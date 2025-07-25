package org.example.api_concesionario.Infrastructure.Persistence.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.UUID;

@Entity
@Table(name = "gallery_car")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class GalleryCarEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id_galley")
    private UUID id_galley;

    @Column(name = "name_galley", length = 50)
    private String nameGalley;

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