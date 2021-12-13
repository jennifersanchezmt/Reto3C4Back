/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Reto3_Ciclo4.Reto3.interfaces;

import Reto3_Ciclo4.Reto3.modelo.Accesory;
/*import java.util.List;*/
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 *
 * @author jeffe
 */
public interface InterfaceAccesory extends MongoRepository<Accesory, String> {
    /*public List<Accesory> findByPriceLessThanEqual(double precio);*/
}

