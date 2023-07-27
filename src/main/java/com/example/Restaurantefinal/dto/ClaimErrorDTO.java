package com.example.Restaurantefinal.dto;

public class ClaimErrorDTO extends ClaimDTO{

    private String messageError;


    public String getMessageError() {
        return messageError;
    }

    public void setMessageError(String messageError) {
        this.messageError = messageError;
    }
}
