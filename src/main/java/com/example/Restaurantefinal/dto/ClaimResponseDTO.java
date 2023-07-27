package com.example.Restaurantefinal.dto;

import jakarta.persistence.Column;

public class ClaimResponseDTO extends ClaimDTO{


    private Integer idOrder;

    private String campus;

    private String state;

    private String reason;


    public Integer getIdOrder() {
        return idOrder;
    }

    public void setIdOrder(Integer idOrder) {
        this.idOrder = idOrder;
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

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }
}
