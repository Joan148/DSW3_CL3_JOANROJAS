package dsw3.t3.joanrojasrodriguez.model;

import dsw3.t3.joanrojasrodriguez.model.pk.NotasId;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "Notas")
public class Notas {

    @EmbeddedId
    private NotasId id;

    @ManyToOne
    @MapsId("idAlumno")
    @JoinColumn(name = "IdAlumno", nullable = false)
    private Alumno alumno;

    @ManyToOne
    @MapsId("idCurso")
    @JoinColumn(name = "IdCurso", nullable = false)
    private Curso curso;

    @Column(name = "ExaParcial")
    private float exaParcial;

    @Column(name = "ExaFinal")
    private float exaFinal;
}
