package com.example.Restaurantefinal.validations;

import com.example.Restaurantefinal.dto.MenuResponseDTO;
import com.example.Restaurantefinal.repository.MenuRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component  //indicar que la validacion se va a estar realizando en las capas.

public class MenuValidation {

    public boolean validatePrice(Integer price){
        if (price < 0){
            return true;
        }else {
            return false;
        }
    }

    public boolean ValidateObligatoryCampus(String campus){
        if(campus.length()==0 || campus==null){
            return true;
        }else{
            return false;
        }
    }


}
