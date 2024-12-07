package com.example.jpa.controllers;

import com.example.jpa.dtos.RequestOrderDto;
import com.example.jpa.models.Order;
import com.example.jpa.impl.OrderServiceImpl;
import com.example.jpa.models.OrderItem;
import com.example.jpa.services.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/orders")
public class OrderController {
    @Autowired
    private OrderService service;

    @PostMapping
    public ResponseEntity<Order> placeOrder(@RequestBody RequestOrderDto orderDto) {
        System.out.println("Sunt in placeOrder");
        Order order = service.placeOrder(orderDto.getUserId(), orderDto.getItems());
        return ResponseEntity.ok(order);
    }

    @GetMapping
    public ResponseEntity<List<Order>> ordersWithPagination(@RequestParam Long userId, @RequestParam int page, @RequestParam int size) {
        List<Order> orders = service.getOrdersWithPagination(userId, page, size);
        return ResponseEntity.ok(orders);
    }


}
