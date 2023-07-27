package com.example.Restaurantefinal.entity;

import jakarta.persistence.Column;

public class Order {

    @Column(name = "id", nullable = false)
    private Integer id;
    @Column(name = "rol", nullable = false)
    private Character rol;
    @Column(name = "campus", nullable = false)
    private String campus;
    @Column(name = "state", nullable = false)
    private String state;

    public Order() {
    }

    public Order(Integer id, Character rol, String campus, String state) {
        this.id = id;
        this.rol = rol;
        this.campus = campus;
        this.state = state;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Character getRol() {
        return rol;
    }

    public void setRol(Character rol) {
        this.rol = rol;
    }

    public String getCampus() {
        return campus;
    }

    public void setCampus(String campus) {
        this.campus = campus;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
}
