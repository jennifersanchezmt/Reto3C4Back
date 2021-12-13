/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Reto3_Ciclo4.Reto3.repositorio;

import Reto3_Ciclo4.Reto3.interfaces.InterfaceAccesory;
import Reto3_Ciclo4.Reto3.modelo.Accesory;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 *
 * @author jeffe
 */
@Repository
public class AccesoryRepositorio {
    @Autowired
    private InterfaceAccesory repository;

    public List<Accesory> getAll() {
        return repository.findAll();
    }

    public Optional<Accesory> getClothe(String reference) {
        return repository.findById(reference);
    }
    public Accesory create(Accesory clothe) {
        return repository.save(clothe);
    }

    public void update(Accesory clothe) {
        repository.save(clothe);
    }
    
    public void delete(Accesory clothe) {
        repository.delete(clothe);
    }
    
   /* public List<Accesory> productByPrice(double precio) {
	return repository.findByPriceLessThanEqual(precio);
    }*/
}

