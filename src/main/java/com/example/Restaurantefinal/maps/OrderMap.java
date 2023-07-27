package com.example.Restaurantefinal.maps;

import com.example.Restaurantefinal.dto.MenuResponseDTO;
import com.example.Restaurantefinal.dto.OrderResponseDTO;
import com.example.Restaurantefinal.entity.Menu;
import com.example.Restaurantefinal.entity.Order;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import java.util.List;

@Mapper(componentModel = "spring")
public interface OrderMap {

    @Mappings({
            @Mapping(source = "id", target = "id"),
            @Mapping(source = "rol", target = "rol"),
            @Mapping(source = "campus", target = "campus"),
            @Mapping(source = "state", target = "state"),
    })
    OrderResponseDTO tranformOrder(Order order);

    List<OrderResponseDTO> transformListMenu(List<Order> listOrders);
}
