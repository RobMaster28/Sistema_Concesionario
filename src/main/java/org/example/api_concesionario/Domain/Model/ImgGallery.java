package org.example.api_concesionario.Domain.Model;

import java.util.UUID;

public record ImgGallery(
    UUID id_img,
    String url_img,
    GalleryCar galleryCar
) {
}
