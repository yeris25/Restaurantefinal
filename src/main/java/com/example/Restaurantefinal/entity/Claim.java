package com.example.Restaurantefinal.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "Claim")
public class Claim {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @Column(name = "idOrder", nullable = false)
    private Integer idOrder;

    @Column(name = "campus", nullable = false)
    private String campus;

    @Column(name = "state", nullable = false)
    private String state;

    @Column(name = "reason", nullable = false)
    private String reason;

    public Claim() {
    }

    public Claim(Integer id, Integer idOrder, String campus, String state, String reason) {
        this.id = id;
        this.idOrder = idOrder;
        this.campus = campus;
        this.state = state;
        this.reason = reason;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

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
