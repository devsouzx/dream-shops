package com.devsouzx.dreamshops.controllers;

import com.devsouzx.dreamshops.dtos.CartDTO;
import com.devsouzx.dreamshops.exceptions.ResourceNotFoundException;
import com.devsouzx.dreamshops.model.Cart;
import com.devsouzx.dreamshops.responses.ApiResponse;
import com.devsouzx.dreamshops.services.cart.ICartService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.math.BigDecimal;

import static org.springframework.http.HttpStatus.NOT_FOUND;

@RequiredArgsConstructor
@RestController
@RequestMapping("${api.prefix}/carts")
public class CartController {
    private final ICartService cartService;

    @GetMapping("/user/{userId}/my-cart")
    public ResponseEntity<ApiResponse> getUserCart(@PathVariable Long userId) {
        try {
            Cart cart = cartService.getCartByUserId(userId);
            CartDTO cartDto = cartService.convertToDto(cart);
            return ResponseEntity.ok(new ApiResponse("Success", cartDto));
        } catch (ResourceNotFoundException e) {
            return ResponseEntity.status(NOT_FOUND).body(new ApiResponse(e.getMessage(), null));
        }
    }

    @DeleteMapping("/{cartId}/clear")
    public ResponseEntity<ApiResponse> clearCart(@PathVariable Long cartId) {
        try {
            cartService.clearCart(cartId);
            return ResponseEntity.ok(new ApiResponse("Clear Cart Success!", null));
        } catch (ResourceNotFoundException e) {
            return ResponseEntity.status(NOT_FOUND).body(new ApiResponse(e.getMessage(), null));
        }
    }

    @GetMapping("/{cartId}/cart/total-price")
    public ResponseEntity<ApiResponse> getTotalAmount(@PathVariable Long cartId) {
        try {
            BigDecimal totalPrice = cartService.getTotalPrice(cartId);
            return ResponseEntity.ok(new ApiResponse("Total Price", totalPrice));
        } catch (ResourceNotFoundException e) {
            return ResponseEntity.status(NOT_FOUND).body(new ApiResponse(e.getMessage(), null));
        }
    }
}