package mvc.gui.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import mvc.gui.model.OrderStatus;
import mvc.gui.model.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {

	List<Product> findByStatus(OrderStatus waiting);
			
}
