package dsw3.t3.joanrojasrodriguez.model.pk;

import jakarta.persistence.*;
import lombok.*;

import java.io.Serializable;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Embeddable
public class NotasId implements Serializable {
    private String idAlumno;
    private String idCurso;
}