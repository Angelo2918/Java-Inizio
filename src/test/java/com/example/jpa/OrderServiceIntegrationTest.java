package com.example.jpa;

import com.example.jpa.models.Order;
import com.example.jpa.models.User;
import com.example.jpa.repositories.OrderRepository;
import com.example.jpa.repositories.UserJpaRepository;
import com.example.jpa.services.OrderService;
import jakarta.transaction.Transactional;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
@ActiveProfiles("test")
@Transactional
public class OrderServiceIntegrationTest {

    @Autowired
    private OrderService service;


    @Autowired
    private OrderRepository orderRepository;

    @Autowired
    private UserJpaRepository userRepository;

    private User testUser;
    private Order testOrder;

    @BeforeEach
    void setUp() {
        //curatare data base
        orderRepository.deleteAll();
        userRepository.deleteAll();

        //creaza user nou
        User u = new User();
        u.setName("Angelo");
        u.setUsername("user 1");
        u.setEmail("user1@gmail.com");

        testUser = userRepository.save(u);
        //creaza order
        Order o = new Order();
        o.setProduct("Test Product");
        o.setUser(testUser);
        o.setPrice(100.0);
        o.setOrderDate(LocalDate.now());
        testOrder = orderRepository.save(o);
    }

    @Test
    void placeOrder_ShouldCreateANewOrder() {
        String product = "New Product";
        Double price = 150.0;

        Order placedOrder = service.placeOrder(testUser.getId(), product, price);

        assertNotNull(placedOrder);
        assertNotNull(placedOrder.getId());
        assertEquals(product, placedOrder.getProduct());
        assertEquals(price, placedOrder.getPrice());
        assertEquals(testUser.getId(), placedOrder.getUser().getId());

        assertTrue(orderRepository.findById(placedOrder.getId()).isPresent());


    }

    @Test
    void placeOrder_ShouldReturnNull_WhenUserDoesNotExist(){
        Order placedOrder = service.placeOrder(9999L,"Same Product",50.0);
        assertNull(placedOrder);
    }

}
