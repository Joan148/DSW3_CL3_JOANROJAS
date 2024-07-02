package dsw3.t3.joanrojasrodriguez.repository;

import dsw3.t3.joanrojasrodriguez.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Integer> {
    Usuario findByNomusuario(String nomusuario);
    Usuario findByNombres(String nombres);

}
