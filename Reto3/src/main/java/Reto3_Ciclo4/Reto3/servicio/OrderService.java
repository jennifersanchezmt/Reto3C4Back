/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Reto3_Ciclo4.Reto3.servicio;

import  Reto3_Ciclo4.Reto3.modelo.Order;
import Reto3_Ciclo4.Reto3.repositorio.OrderRepositorio;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
/**
 *
 * @author jeffe
 */
@Service
public class OrderService {
    @Autowired
    private OrderRepositorio orderRepository;

    public List<Order> getAll() {
        return orderRepository.getAll();
    }

    public Optional<Order> getOrder(int id) {
        return orderRepository.getOrder(id);
    }

    public Order create(Order order) {
        if (order.getId() == null) {
            return order;
        } else {
            return orderRepository.create(order);
        }
    }

    public Order update(Order order) {

        if (order.getId() != null) {
            Optional<Order> orderDb = orderRepository.getOrder(order.getId());
            //if (!orderDb.isEmpty()) {
             if (orderDb.isPresent()) {
                /*if (order.getStatus() != null) {
                    orderDb.get().setStatus(order.getStatus());
                }
                orderRepository.update(orderDb.get());
                return orderDb.get();*/
                if (order.getId() != null){
                    orderDb.get().setId(order.getId());
                }
                
                if (order.getRegisterDay() != null){
                    orderDb.get().setRegisterDay(order.getRegisterDay());
                }
                
                if (order.getStatus() != null){
                    orderDb.get().setStatus(order.getStatus());
                }
                
                if (order.getSalesMan() != null){
                    orderDb.get().setSalesMan(order.getSalesMan());
                }
                
                if (order.getProducts() != null){
                    orderDb.get().setProducts(order.getProducts());
                }
                
                if (order.getQuantities() != null){
                    orderDb.get().setQuantities(order.getQuantities());
                }
                orderRepository.update(orderDb.get());
                return orderDb.get();
            } else {
                return order;
            }
        } else {
            return order;
        }
    }

    public boolean delete(int id) {
        Boolean aBoolean = getOrder(id).map(order -> {
            orderRepository.delete(order);
            return true;
        }).orElse(false);
        return aBoolean;
    }
   //Ordenes de pedido asociadas a los asesores de una zona
    public List<Order> findByZone(String zona) {
        return orderRepository.findByZone(zona);
    }
/*
    public List<Order> ordersSalesManByDate(String dateStr, int id) {
         return orderRepository.ordersSalesManByDate(dateStr, id);
    }
    
    public List<Order> ordersSalesManByState(String state, Integer id) {
        return orderRepository.ordersSalesManByState(state, id);
    }*/
}

