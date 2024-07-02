package dsw3.t3.joanrojasrodriguez.model.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class UsuarioSeguridadDto {
    private Integer idusuario;
    private String nomusuario;
    private String token;
}
