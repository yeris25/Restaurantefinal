package com.example.Restaurantefinal.repository;

import com.example.Restaurantefinal.entity.Menu;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;



@Repository
public interface MenuRepository extends JpaRepository<Menu, Long> {
    Page<Menu> findByCategoryAndCampus(String category, String campus, Pageable pager);
}
