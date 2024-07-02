package dsw3.t3.joanrojasrodriguez.service;

import dsw3.t3.joanrojasrodriguez.model.Usuario;
import dsw3.t3.joanrojasrodriguez.repository.UsuarioRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@AllArgsConstructor
@Service
public class UsuarioService implements IUsuarioService {

    private UsuarioRepository usuarioRepository;

    @Override
    public Usuario obtenerUsuarioPorNomUsuario(
            String nomusuario) {
        return usuarioRepository.findByNomusuario(nomusuario);
    }
}
