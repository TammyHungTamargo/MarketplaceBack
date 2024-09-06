package edu.es.eoi.marketplace.repository;
import edu.es.eoi.marketplace.entity.Pedido;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PedidoRepository extends JpaRepository<Pedido, Integer> {
}
