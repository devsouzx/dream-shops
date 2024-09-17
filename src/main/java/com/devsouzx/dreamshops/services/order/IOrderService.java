package com.devsouzx.dreamshops.services.order;

import com.devsouzx.dreamshops.dtos.OrderDTO;
import com.devsouzx.dreamshops.model.Order;

import java.util.List;

public interface IOrderService {
    Order placeOrder(Long userId);
    OrderDTO getOrder(Long orderId);
    List<OrderDTO> getUserOrders(Long userId);
}
