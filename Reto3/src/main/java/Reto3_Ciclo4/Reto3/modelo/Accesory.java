/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Reto3_Ciclo4.Reto3.modelo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 *
 * @author USUARIO
 */
@Document(collection = "accessories")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Accesory {
    @Id
    private String reference;
    private String brand;
    private String category;
    private String material;
    private String gender;
    private String size;
    private String description;
    private boolean availability = true;
    private double price;
    private int quantity;
    private String photography;
}
