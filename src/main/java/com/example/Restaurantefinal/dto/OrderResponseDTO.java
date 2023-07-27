package com.example.Restaurantefinal.dto;

import jakarta.persistence.Column;

public class OrderResponseDTO extends OrderDTO{


    private String campus;
    private String state;


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
