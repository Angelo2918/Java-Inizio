package com.example.jpa.dtos;

import java.io.Serializable;
import java.time.LocalDate;

public class OrderDto implements Serializable {

    private String product;
    private Double price;
    private LocalDate orderDate;

}
