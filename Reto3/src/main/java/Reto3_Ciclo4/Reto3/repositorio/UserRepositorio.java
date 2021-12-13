/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Reto3_Ciclo4.Reto3.repositorio;

import Reto3_Ciclo4.Reto3.interfaces.InterfaceUser;
import Reto3_Ciclo4.Reto3.modelo.User;
//import Reto3_Ciclo4.Reto3.modelo.Order;
//import java.time.LocalDate;
//import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
//import org.springframework.data.mongodb.core.MongoTemplate;
//import org.springframework.data.mongodb.core.query.Criteria;
//import org.springframework.data.mongodb.core.query.Query;

/**
 *
 * @author jeffe
 */
@Repository
public class UserRepositorio {

    @Autowired
    private InterfaceUser userCrudRepository;

   /* @Autowired
    private MongoTemplate mongoTemplate;*/

    public List<User> getAll() {
        return (List<User>) userCrudRepository.findAll();
    }

    public Optional<User> getUser(int id) {
        return userCrudRepository.findById(id);
    }

    public User create(User user) {
        return userCrudRepository.save(user);
    }

    public void update(User user) {
        userCrudRepository.save(user);
    }

    public void delete(User user) {
        userCrudRepository.delete(user);
    }

    /* public boolean emailExists(String email) {
        Optional<User> usuario = userCrudRepository.findByEmail(email);
        
        return !usuario.isEmpty();
    } ESTE NO
     */
    public boolean emailExists(String email) {
        Optional<User> usuario = userCrudRepository.findByEmail(email);
        return usuario.isPresent();
    }

    public Optional<User> authenticateUser(String email, String password) {
        return userCrudRepository.findByEmailAndPassword(email, password);
    }
/*
    public List<User> birthtDayList(String monthBirthtDay) {
        return userCrudRepository.findByMonthBirthtDay(monthBirthtDay);
    }
*/
}
