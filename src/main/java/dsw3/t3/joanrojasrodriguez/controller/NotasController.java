package dsw3.t3.joanrojasrodriguez.controller;

import dsw3.t3.joanrojasrodriguez.model.dto.NotasDto;
import dsw3.t3.joanrojasrodriguez.service.INotasService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@AllArgsConstructor
@RestController
@RequestMapping("/pubs-dto")
public class NotasController {

    private INotasService notasService;

    @GetMapping
    public ResponseEntity<List<NotasDto>> getNotasDTOs() {
        List<NotasDto> notasDTOs = notasService.getNotasDTOs();
        return new ResponseEntity<>(notasDTOs, HttpStatus.OK);
    }
}
