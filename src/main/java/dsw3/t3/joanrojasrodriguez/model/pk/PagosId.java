package dsw3.t3.joanrojasrodriguez.model.pk;

import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Embeddable
public class PagosId implements Serializable {
    private String idAlumno;
    private String ciclo;
    private int nCuota;
}
