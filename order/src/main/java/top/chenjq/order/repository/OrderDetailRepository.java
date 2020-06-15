package top.chenjq.order.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import top.chenjq.order.dataobject.OrderDetail;

import java.util.List;

/**
 * Created by 廖师兄
 * 2017-12-10 16:12
 */
public interface OrderDetailRepository extends JpaRepository<OrderDetail, String> {

	List<OrderDetail> findByOrderId(String orderId);
}
