package com.example.jpa.repositories;

import com.example.jpa.models.Order;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface OrderRepository  extends JpaRepository<Order,Long> {
List<Order> findByUserId(Long userId);
Page<Order> findByUserId(Long userId, Pageable pageable);

}