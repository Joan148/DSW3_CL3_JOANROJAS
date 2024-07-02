package dsw3.t3.joanrojasrodriguez.repository;

import dsw3.t3.joanrojasrodriguez.model.Rol;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RolRepository extends JpaRepository<Rol, Integer> {
    Rol findByNomrol(String nomrol);
}