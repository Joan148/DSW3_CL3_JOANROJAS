package dsw3.t3.joanrojasrodriguez.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "especialidad")
public class Especialidad {
    @Id
    @Column(name = "IdEsp", nullable = false, length = 3)
    private String idEsp;
    @Column(name = "NomEsp", nullable = false, length = 30)
    private String nomEsp;
    @Column(name = "Costo", nullable = false)
    private Double costo;
}
