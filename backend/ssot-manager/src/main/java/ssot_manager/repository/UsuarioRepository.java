package ssot_manager.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ssot_manager.entity.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {

}