package com.example.Restaurantefinal.maps;

import com.example.Restaurantefinal.dto.MenuDTO;
import com.example.Restaurantefinal.dto.MenuResponseDTO;
import com.example.Restaurantefinal.entity.Menu;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import java.lang.management.PlatformLoggingMXBean;
import java.util.List;

@Mapper(componentModel = "spring")
public interface MenuMap {

    @Mappings({
            @Mapping(source = "menuName", target = "name"),
            @Mapping(source = "price", target = "price"),
            @Mapping(source = "url", target = "photo"),
            @Mapping(source = "description", target = "description"),
            @Mapping(source = "campus", target = "campus")
    })

     MenuResponseDTO tranformMenu(Menu menu);

    List<MenuResponseDTO> transformListMenu(List<Menu> listMenus);


}
