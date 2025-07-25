package org.example.api_concesionario.Infrastructure.Persistence.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.UUID;

@Entity
@Table(name = "img_galley")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class ImgGalleryEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id_img")
    private UUID id_img;

    @Column(name = "url_img", nullable = false, columnDefinition = "TEXT")
    private String url_img;

    @ManyToOne(
            fetch = FetchType.LAZY,
            cascade = {CascadeType.REFRESH, CascadeType.MERGE}
    )
    @JoinColumn(
            name = "id_galley",
            referencedColumnName = "id_galley"
    )
    private GalleryCarEntity galleryCar;
}
