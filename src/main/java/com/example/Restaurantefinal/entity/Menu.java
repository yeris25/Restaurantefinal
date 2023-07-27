package com.example.Restaurantefinal.entity;

import jakarta.persistence.*;
import jakarta.persistence.criteria.CriteriaBuilder;
import org.springframework.boot.autoconfigure.web.WebProperties;

import javax.swing.text.StyledEditorKit;

@Entity
@Table (name = "menu") //anotaciones
public class Menu {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")

    private Long id;
    @Column(name = "rol", nullable = false)
    private Character rol;

    @Column(name = "MenuName", nullable = false)
    private String MenuName;

    @Column(name = "price", nullable = false)
    private Integer price;
    @Column(name = "description", nullable = false)
    private String description;
    @Column(name = "url", nullable = false)
    private String url;
    @Column(name = "category", nullable = false)
    private String category;
    @Column(name = "state", nullable = false)
    private Boolean state;
    @Column(name = "campus", nullable = false)
    private  String campus;
    @Column(name = "timePreparation", nullable = false)
    private double timePreparation;

    public Menu() {
    }


    public Menu(Long id, Character rol, String platoName, Integer price, String description, String url, String category, Boolean state, String campus, double timePreparation) {
        this.id = id;
        this.rol = rol;
        this.MenuName = platoName;
        this.price = price;
        this.description = description;
        this.url = url;
        this.category = category;
        this.state = state;
        this.campus = campus;
        this.timePreparation = timePreparation;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Character getRol() {
        return rol;
    }

    public void setRol(Character rol) {
        this.rol = rol;
    }

    public String getPlatoName() {
        return MenuName;
    }

    public void setPlatoName(String platoName) {
        this.MenuName = platoName;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public Boolean getState() {
        return state;
    }

    public void setState(Boolean state) {
        this.state = state;
    }

    public String getCampus() {
        return campus;
    }

    public void setCampus(String campus) {
        this.campus = campus;
    }

    public double getTimePreparation() {
        return timePreparation;
    }

    public void setTimePreparation(double timePreparation) {
        this.timePreparation = timePreparation;
    }
}
