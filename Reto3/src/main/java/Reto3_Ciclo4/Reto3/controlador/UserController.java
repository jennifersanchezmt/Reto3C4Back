/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Reto3_Ciclo4.Reto3.controlador;

/**
 * Importaciones
 */
import Reto3_Ciclo4.Reto3.servicio.UserService;
import Reto3_Ciclo4.Reto3.modelo.User;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

/**
 * Rest Controller
 *
 * @author Jennifer
 */
@RestController
/**
 * Mapping User
 */
@RequestMapping("/api/user")
/**
 * Cross Origin
 */
@CrossOrigin("*")
/**
 * Clase UserController
 */
public class UserController {

    /**
     * Autowired
     */
    @Autowired
    private UserService userService;

    /**
     * Mapping Get All
     *
     * @return
     */
    @GetMapping("/all")
    public List<User> getAll() {
        return userService.getAll();
    }

    /**
     * Mapping Get id
     *
     * @param id
     * @return
     */
    @GetMapping("/{id}")
    public Optional<User> getUser(@PathVariable("id") int id) {
        return userService.getUser(id);
    }

    /**
     * Mapping Post New
     *
     * @param user
     * @return
     */
    @PostMapping("/new")
    @ResponseStatus(HttpStatus.CREATED)
    public User create(@RequestBody User user) {
        return userService.create(user);
    }

    /**
     * Mapping Put Update
     *
     * @param user
     * @return
     */
    @PutMapping("/update")
    @ResponseStatus(HttpStatus.CREATED)
    public User update(@RequestBody User user) {
        return userService.update(user);
    }

    /**
     * Mapping Delete
     *
     * @param id
     * @return
     */
    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public boolean delete(@PathVariable("id") int id) {
        return userService.delete(id);
    }

    /**
     * Mapping Get Email
     *
     * @param email
     * @param password
     * @return
     */
    @GetMapping("/{email}/{password}")
    public User authenticateUser(@PathVariable("email") String email, @PathVariable("password") String password) {
        return userService.authenticateUser(email, password);
    }

    /**
     * Mapping Get Emailexist
     *
     * @param email
     * @return
     */
    @GetMapping("/emailexist/{email}")
    public boolean emailExists(@PathVariable("email") String email) {
        return userService.emailExists(email);
    }
}
/*@GetMapping("/birthday/{month}")
    public List<User> birthtDayList(@PathVariable("month") String monthBirthtDay) {
        return userService.BirthtDayList(monthBirthtDay);
    }
}*/
