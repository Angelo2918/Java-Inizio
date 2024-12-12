package com.example.jpa.services;

import com.example.jpa.models.Order;
import com.example.jpa.models.OrderItem;

import java.util.List;


public interface OrderService {
    Order placeOrder(Long userId, List<OrderItem> items);

    List<Order> getOrdersWithPagination(Long userId, int page, int size);

    Order cancelOrder(Long orderId);
}