package dsw3.t3.joanrojasrodriguez.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

@RestController
@RequestMapping("api/v1/filesdoc")
public class FileController {

    private static final String UPLOAD_DIR = "Documentos";
    private static final long MAX_FILE_SIZE = 2 * 1024 * 1024; // 2MB

    @PostMapping
    public ResponseEntity<String> uploadFile(@RequestParam("file") MultipartFile file) {
        String fileName = StringUtils.cleanPath(file.getOriginalFilename());

        if (!fileName.endsWith(".doc")) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Only DOC files are allowed.");
        }

        if (file.getSize() > MAX_FILE_SIZE) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("File size exceeds the 2MB limit.");
        }

        try {
            // Obtener la ruta absoluta del directorio de subida
            Path uploadPath = Paths.get(System.getProperty("user.dir"), UPLOAD_DIR);
            if (!Files.exists(uploadPath)) {
                Files.createDirectories(uploadPath);
            }

            // Guardar el archivo en el directorio
            Path filePath = uploadPath.resolve(fileName);
            file.transferTo(filePath.toFile());

            return ResponseEntity.status(HttpStatus.OK).body("File uploaded successfully: " + fileName);
        } catch (IOException e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("File upload failed: " + e.getMessage());
        }
    }
}

