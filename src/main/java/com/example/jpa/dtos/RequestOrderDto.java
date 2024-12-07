package com.example.jpa.dtos;

import com.example.jpa.models.OrderItem;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class RequestOrderDto {

        private Long userId;
        private List<OrderItem> items;


}
