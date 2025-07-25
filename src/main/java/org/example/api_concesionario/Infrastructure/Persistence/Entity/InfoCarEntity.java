package org.example.api_concesionario.Infrastructure.Persistence.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.UUID;

@Entity
@Table(name = "info_car")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class InfoCarEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id_info")
    private UUID id;

    @Column(name = "url_img_info_car", nullable = false, columnDefinition = "TEXT")
    private String urlImgInfoCar;

    @Column(name = "title", nullable = false, length = 60)
    private String title;

    @Column(name = "description_info", nullable = false, columnDefinition = "TEXT")
    private String descriptionInfo;

    @Column(name = "is_left", nullable = false)
    private Boolean is_left= Boolean.FALSE;

    @Column(name = "is_deleted", nullable = false)
    private Boolean is_deleted = Boolean.FALSE;

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