package org.example.api_concesionario.Domain.Service;

import lombok.RequiredArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.util.UUID;

@RequiredArgsConstructor
@Component
public class SaveFile {
    @Value("${server.port}")
    private String port;
    private final Logger log = LoggerFactory.getLogger(SaveFile.class);
    public String summitFile(MultipartFile file) {
        if (!file.isEmpty()) {
            try {
                Path carpetaUploads = Paths.get("uploads");
                if (Files.notExists(carpetaUploads)) {
                    Files.createDirectories(carpetaUploads);
                }
                String nombreArchivo = UUID.randomUUID() + "_" + file.getOriginalFilename();
                Path rutaArchivo = carpetaUploads.resolve(nombreArchivo);
                Files.copy(file.getInputStream(), rutaArchivo, StandardCopyOption.REPLACE_EXISTING);
                return "http://localhost:" + port + "/uploads/" + nombreArchivo;
            } catch (IOException e) {
                log.error("Ocurrió un error al cargar el archivo: {}", e.getMessage());
            }
        }
        return "No se pudo subir el archivo";
    }
}
