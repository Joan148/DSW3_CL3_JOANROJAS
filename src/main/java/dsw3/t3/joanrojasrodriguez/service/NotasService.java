package dsw3.t3.joanrojasrodriguez.service;

import dsw3.t3.joanrojasrodriguez.model.Notas;
import dsw3.t3.joanrojasrodriguez.model.dto.NotasDto;
import dsw3.t3.joanrojasrodriguez.repository.NotasRespository;
import dsw3.t3.joanrojasrodriguez.util.DtoUtil;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@AllArgsConstructor
@Service
public class NotasService implements INotasService {
    private NotasRespository notasRepository;

    private DtoUtil dtoUtil;

    @Override
    public List<NotasDto> getNotasDTOs() {
        List<Notas> notasList = notasRepository.findAll();
        return notasList.stream()
                .map(notas -> {
                    NotasDto notasDto = (NotasDto) dtoUtil.convertirADto(notas, new NotasDto());
                    notasDto.setNombreCurso(notas.getCurso().getNomCurso());
                    notasDto.setApellidoAlumno(notas.getAlumno().getApeAlumno());
                    notasDto.setNombreAlumno(notas.getAlumno().getNomAlumno());
                    return notasDto;
                })
                .collect(Collectors.toList());
    }
}