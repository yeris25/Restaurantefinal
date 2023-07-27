package com.example.Restaurantefinal.dto;

public class MenuErrorDTO extends MenuDTO{

    private String messageError;

    public String getMessageErro() {
        return messageError;
    }

    public void setMessageErro(String messageErro) {
        this.messageError = messageErro;
    }
}
