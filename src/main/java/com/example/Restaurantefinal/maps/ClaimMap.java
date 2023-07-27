package com.example.Restaurantefinal.maps;

import com.example.Restaurantefinal.dto.ClaimResponseDTO;
import com.example.Restaurantefinal.dto.MenuResponseDTO;
import com.example.Restaurantefinal.entity.Claim;
import com.example.Restaurantefinal.entity.Menu;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import java.util.List;

@Mapper(componentModel = "spring")
public interface ClaimMap {

    @Mappings({
            @Mapping(source = "menuName", target = "name"),
            @Mapping(source = "price", target = "price"),
            @Mapping(source = "url", target = "photo"),
            @Mapping(source = "description", target = "description"),
            @Mapping(source = "campus", target = "campus")
    })
    ClaimResponseDTO tranformMenu(Claim claim);

    List<ClaimResponseDTO> transformListMenu(List<Claim> listClaims);


}


