package order.dao;

import order.domain.Order;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface OrderDao {
    /**
     * 1 新建订单
     */
    int create(Order order);

    /**
     * 2 修改订单状态,从 0 改为 1
     */
    int update(@Param("userId") Long userId, @Param("status") Integer status);
}
