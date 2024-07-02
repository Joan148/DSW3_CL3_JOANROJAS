package dsw3.t3.joanrojasrodriguez.model.dto;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
public class NotasDto implements DtoEntity{
    private Float exaParcial;
    private Float exaFinal;
    private String nombreCurso;
    private String apellidoAlumno;
    private String nombreAlumno;
}
