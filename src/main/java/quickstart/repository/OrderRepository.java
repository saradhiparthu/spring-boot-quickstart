package quickstart.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import quickstart.entity.Order;

public interface OrderRepository extends JpaRepository<Order, Integer> {
}