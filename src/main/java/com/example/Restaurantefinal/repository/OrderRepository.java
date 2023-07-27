package com.example.Restaurantefinal.repository;

import com.example.Restaurantefinal.entity.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.awt.*;

@Repository
public interface OrderRepository  extends JpaRepository<Order, Long> {
}
