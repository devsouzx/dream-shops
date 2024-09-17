package com.devsouzx.dreamshops.dtos;

import lombok.Data;

import java.math.BigDecimal;
import java.util.Set;

@Data
public class OrderDTO {
    private Long cartId;
    private Set<OrderItemDTO> items;
    private BigDecimal totalAmount;
}
