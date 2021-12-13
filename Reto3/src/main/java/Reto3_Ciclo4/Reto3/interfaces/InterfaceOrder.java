/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Reto3_Ciclo4.Reto3.interfaces;

import Reto3_Ciclo4.Reto3.modelo.Order;
//import java.util.Date;
import java.util.List;
import org.springframework.data.mongodb.repository.MongoRepository;
//import org.springframework.data.mongodb.repository.Query;
//import org.springframework.data.repository.CrudRepository;
/**
 *
 * @author jeffe
 */
public interface InterfaceOrder extends MongoRepository <Order, Integer> {

   /* @Query("{'salesMan.zone': ?0}")
    List<Order> findByZone(final String country);
    
    @Query("{status: ?0}")
    List<Order> findByStatus(final String status);*/
    List<Order> findByZone(String zona); 
}

