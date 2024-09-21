package com.devsouzx.dreamshops.services.cart;

import com.devsouzx.dreamshops.dtos.CartDTO;
import com.devsouzx.dreamshops.model.Cart;
import com.devsouzx.dreamshops.model.User;

import java.math.BigDecimal;

public interface ICartService {
    Cart getCart(Long id);
    void clearCart(Long id);
    BigDecimal getTotalPrice(Long id);
    Cart initializeNewCart(User user);
    Cart getCartByUserId(Long userId);
    CartDTO convertToDto(Cart cart);
}
