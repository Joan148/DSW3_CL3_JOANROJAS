package dsw3.t3.joanrojasrodriguez.repository;

import dsw3.t3.joanrojasrodriguez.model.Notas;
import dsw3.t3.joanrojasrodriguez.model.pk.NotasId;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NotasRespository extends JpaRepository<Notas, NotasId> {
}
