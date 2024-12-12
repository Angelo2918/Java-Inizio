package com.example.jpa.models;

import com.example.jpa.enums.InstrumentCategory;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Represents an instrument entity with details such as ID, name, price, category, manufacturer, and stock quantity.
 */
@Entity
@Table(name = "instrument")
@Data
@NoArgsConstructor
public class Instrument {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String name;
    @Column(nullable = false)
    private BigDecimal price;
    @Enumerated(EnumType.STRING)
    private InstrumentCategory category;
    private String manufacturer;
    @Column(nullable = false)
    private int stockQuantity;

    @JsonManagedReference
    @OneToMany(mappedBy = "instrument", cascade = CascadeType.ALL)
    private List<Review> reviews = new ArrayList<>();

    @ManyToMany(mappedBy = "wishlist")
    private Set<User> users = new HashSet<>();
}