package com.example.Restaurantefinal.service;

import com.example.Restaurantefinal.dto.MenuResponseDTO;
import com.example.Restaurantefinal.entity.Menu;
import com.example.Restaurantefinal.maps.MenuMap;
import com.example.Restaurantefinal.repository.MenuRepository;
import com.example.Restaurantefinal.validations.MenuValidation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class MenuService {

    @Autowired //Se crea dependencia entre clases.
    MenuValidation validation;
    @Autowired
    MenuRepository goToDatabase;
    @Autowired
    MenuMap maps;


    public MenuResponseDTO createMenu(Menu dateMenuRegister) throws Exception {
        try {
            if (!dateMenuRegister.getRol().equals('A')) {
                throw new Exception("Unauthorized role to create a menu"); //Crear nueva excepcion
            }
            if (validation.validatePrice(dateMenuRegister.getPrice())) {
                throw new Exception("the price is invalid");
            }

            if (validation.ValidateObligatoryCampus(dateMenuRegister.getCampus())) {
                throw new Exception("the campus is mandatory");
            }

            return maps.tranformMenu(goToDatabase.save(dateMenuRegister));

        } catch (Exception error) {
            throw new Exception(error.getMessage());
        }
    }

    public MenuResponseDTO updateStatus(Menu newDataToEdit) throws Exception {
        try {
            if (!newDataToEdit.getRol().equals("A")) {
                throw new Exception("Unauthorized role to create a menu");
            }

            //Buscar si el plato que envie existe en la bd
            Optional<Menu> menuOptional = goToDatabase.findById(newDataToEdit.getId());
            if (!menuOptional.isPresent()) {
                throw new Exception("el plato no existe en la bd");
            }

            //El plato si esta, entonces puedo obtener la informacion del plato
            Menu menuFound = menuOptional.get();

            //ACTUALIZO LOS DATOS QUE NECESITO (ESTADO)
            //set es del campo que quiere actualizar
            //get es el dato que llega al cliente
            menuFound.setState(newDataToEdit.getState());

            //Guardamos los cambios en BD
            Menu menuUpdate = goToDatabase.save(menuFound);

            //Transformo el plato en DTO
            return maps.tranformMenu(menuUpdate);

        } catch (Exception error) {
            throw new Exception(error.getMessage());
        }
    }

    public Page<MenuResponseDTO> obtenerplatosPorcategoriaYsede(String category, String campus, int registrationNumber) throws Exception {
        try {

            //Crear un objeto especial de springboot pageable
            //El numero de paginas y el numero de registro por paginas
            Pageable pager = PageRequest.of(0, registrationNumber);

            //Realizar la conulta paginada
            Page<Menu> platosPaginadosEncontrados = goToDatabase.findByCategoryAndCampus(category, campus, pager);
            return null;

        } catch (Exception error) {
            throw new Exception(error.getMessage());

        }
    }
}