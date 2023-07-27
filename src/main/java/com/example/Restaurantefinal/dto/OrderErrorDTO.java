package com.example.Restaurantefinal.dto;

import org.aspectj.weaver.ast.Or;

public class OrderErrorDTO extends OrderDTO {

    private String messageError;

    public String getMessageError() {
        return messageError;
    }

    public void setMessageError(String messageError) {
        this.messageError = messageError;
    }
}
