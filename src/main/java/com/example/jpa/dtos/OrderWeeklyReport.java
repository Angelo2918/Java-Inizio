package com.example.jpa.dtos;

import com.example.jpa.enums.OrderStatus;
import lombok.Data;
import lombok.ToString;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Map;

@Data//pentru getere si setere!
@ToString
public class OrderWeeklyReport {
    private int totalOrders;
    private LocalDate startDate;
    private LocalDate endDate;
    private BigDecimal totalRevenue;
    private Map<OrderStatus,Long> orderStatus;

}
