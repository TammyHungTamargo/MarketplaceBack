package edu.es.eoi.marketplace.repository;
import edu.es.eoi.marketplace.entity.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepository extends JpaRepository<Usuario, Integer> {
}
