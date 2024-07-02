package dsw3.t3.joanrojasrodriguez.model;

import dsw3.t3.joanrojasrodriguez.model.pk.PagosId;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "pagos")
public class Pago {
    @EmbeddedId
    private PagosId id;

    @ManyToOne
    @MapsId("idAlumno")
    @JoinColumn(name = "IdAlumno", nullable = false)
    private Alumno alumno;

    @Column(name = "Monto", nullable = false)
    private Double monto;

    @Column(name = "Fecha", columnDefinition = "DATETIME")
    private Date fecha;


}
