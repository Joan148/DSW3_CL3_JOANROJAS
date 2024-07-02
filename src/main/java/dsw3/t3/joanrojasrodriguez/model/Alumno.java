package dsw3.t3.joanrojasrodriguez.model;

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
@Table(name = "alumno")
public class Alumno {
    @Id
    @Column(name = "IdAlumno", nullable = false, length = 5)
    private String idAlumno;
    @Column(name = "ApeAlumno", nullable = false, length = 30)
    private String apeAlumno;
    @Column(name = "NomAlumno", nullable = false, length = 30)
    private String nomAlumno;
    @Column(name = "Proce")
    private char proce;
    @ManyToOne
    @JoinColumn(name = "IdEsp", nullable = false)
    private Especialidad especialidad;

}
