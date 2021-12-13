/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Reto3_Ciclo4.Reto3.interfaces;

import Reto3_Ciclo4.Reto3.modelo.User;
/*import java.util.Date;
import java.util.List;*/
import java.util.Optional;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 *
 * @author USUARIO
 */
public interface InterfaceUser extends MongoRepository<User, Integer> {

    Optional<User> findByEmail(String email);

    /*List<User> findBybirthtDay(Date date);*/

    Optional<User> findByEmailAndPassword(String email, String password);

   /* List<User> findByMonthBirthtDay(String monthBirthtDay);*/
}
