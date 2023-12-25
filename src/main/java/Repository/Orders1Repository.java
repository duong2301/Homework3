package Repository;

import Entity.OrdersDetail;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface OrdertailsRepository extends CrudRepository<OrdersDetail,Integer> {
    List<OrdersDetail> findByUnitPriceGreaterThan(double unitPrice);

    List<OrdersDetail> findByProductNameContaining(String productName);

}
