package com.example.jpa.repositories;

import com.example.jpa.models.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository  extends JpaRepository<Order,Long> {
}
